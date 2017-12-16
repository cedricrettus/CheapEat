package controllers;

import models.Angebot;
import models.AngeboteAll;
import models.Benutzer;
import models.Bild;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import play.db.jpa.*;
import play.data.FormFactory;

import javax.inject.Inject;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static play.libs.Json.*;

public class AngebotController extends Controller {


    @Inject
    FormFactory formFactory;

    //Service für das Hochladen der Bilder zum s3 bucket
    private S3Service s3 = new S3Service();
    //Dateiname für die hochgeladenen BIlder
    private String filename;

    /*
     * Ein angebot wird erstellt mit den Angaben des Requests, bilder werden zum s3 Bucket hochgeladen. Der Request mus authentifiziert sein
     * damit die unique Benutzer Email ausgelesen werden kann
     */
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addOffer() {
        Form<Angebot> submission = formFactory.form(Angebot.class).bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Form error");
            System.out.println(submission.errors());
            return badRequest("Ungültige Angaben");

        } else {
            Angebot angebot = submission.get();
            Benutzer benutzer;

            if(request().username() != null){
                 benutzer = Benutzer.findByEmail(request().username());
            }else{
                return badRequest("Benutzer muss angemeldet sein um ein Angebot zu erstellen!");
            }

            //Bilder hochladen, angebot wird nachher persisted, damit nicht ein angebot ohne Bilder besteht
            Http.MultipartFormData<File> body = request().body().asMultipartFormData();

            if(body != null){
                List<Http.MultipartFormData.FilePart<File>> bilder = body.getFiles();
                //TODO maximale Anzahl an Bilder beschränken
                //TODO bilder als Thumbnail und big hochladen
                if (bilder.size() > 0) {
                    for (int i = 0; i < bilder.size(); i++) {
                        filename = UUID.randomUUID().toString();
                        if (s3.uploadImage(bilder.get(i).getFile(), filename)) {
                            System.out.println("image uploaded!");

                            //filename in db schreiben
                            Bild bild = new Bild(filename, angebot.getId());
                            bild.save();
                            angebot.setBild(1);

                        } else {
                            System.out.println("upload failed!");
                        }
                    }
                } else {
                    System.out.println("Keine Bilder hochgeladen");
                }
            }else{
                System.out.println("Keine Bilder ausgewählt");
            }

            //Angebot persisten

            DateFormat format = new SimpleDateFormat("HH:mm");
            Date time = null;
            try {
                time = format.parse(angebot.getZeitForm());
            } catch (ParseException e) {
                e.printStackTrace();
                return badRequest("Ungültige Zeitangabe");
            }

            angebot.setZeit(time);
            //Dem angebot wird die BenutzerId des Angeboterstellers zugewiesen
            angebot.setBenutzer_id(benutzer.getId());

            //Verfügbare Menge des Angebots initial auf angebotsmenge setzen
            angebot.setMengeVerfuegbar(angebot.getMenge());

            angebot.save();
            JPA.em().flush();

        }
        return ok("Angebot erstellt");
    }

    /*
     * Es wird eine Liste von 15 zufälligen Angeboten zurückgegeben, inkl URLs der Bilder und PLZs
     */
    @Transactional(readOnly = true)
    public Result getAngeboteList() {

        List<Angebot> angebote = JPA.em().createQuery("select p from Angebot p").getResultList();
        List<Angebot> zufAngebote = new ArrayList<Angebot>();

        //Anzahl der Elemente in der Zufallsliste
        int noElements = 0;

        if(angebote.size() >= 15){
            noElements = 15;
        }else{
            noElements = angebote.size();
        }

        Random rand = new Random();

        for (int i = 0; i < noElements; i++) {
            //Wählt einen zufälligen index aus allen angeboten
            int randomIndex = rand.nextInt(angebote.size());
            //fügt das ausgewählte angebot der neuen zufallsListe hinzu und entfernt das Angabot aus der bestehenden liste
            //damit es nicht 2mal ausgewählt wird
            zufAngebote.add(angebote.get(randomIndex));
            angebote.remove(randomIndex);
        }

        return ok(toJson(AngeboteAll.buildCompleteOfferFromId(zufAngebote)));
    }

    /*
     * Ein Angebot wird nach seiner ID zurückgegeben, inkl URLs der Bilder und PLZs
     */
    @Transactional(readOnly = true)
    public Result getAngebote(int id) {
        //TODO select angebot by id
        Angebot angebot = Angebot.findById(id);
        List<Angebot> angebote = new ArrayList<Angebot>();
        angebote.add(angebot);

        return ok(toJson(AngeboteAll.buildCompleteOfferFromId(angebote)));

    }

    /*
     * Angebote werden nach PLZ durchsucht, falls eine Datum mitgegeben wird, wird auch nach Datum gefiltert
     */
    @Transactional(readOnly = true)
    public Result searchOffers(int plz) {
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String datum = requestData.get("datum");

        List<Angebot> angebote;


        if(datum != null && datum != "null"){
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            Date date = null;
            try {
                date = format.parse(datum);
            } catch (ParseException e) {
               return badRequest("Ungültiges Datum");
            }
            angebote = JPA.em().createQuery("select p from Angebot p, Adresse a where p.datum = '"+ new java.sql.Date(date.getTime()) +"' and a.plz like "+ plz +" and a.benutzer_id = p.benutzer_id").getResultList();
        }else{
            angebote = JPA.em().createQuery("select p from Angebot p, Adresse a where a.plz like "+ plz +" and a.benutzer_id = p.benutzer_id").getResultList();
        }

        System.out.println("test");

        //List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p, x, y from Angebot p, Bilderangebote x, Bild y where (x.angebote_id = p.id and x.bilder_id = y.id) or p.bild = 0").getResultList();
        return ok(toJson(AngeboteAll.buildCompleteOfferFromId(angebote)));
    }

    /*
     * Bewertung eines Benutzers wird über seine ID zurückgegeben
     */
    public Result getUserRating(int id){
        Benutzer benutzer = Benutzer.findById(id);
        return ok(toJson(benutzer.getBewertung()));
    }

}



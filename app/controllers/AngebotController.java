package controllers;

import models.Angebot;
import models.AngeboteAll;
import models.Bild;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import play.db.jpa.*;
import play.data.FormFactory;

import javax.inject.Inject;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static play.libs.Json.*;

public class AngebotController extends Controller {


    @Inject
    FormFactory formFactory;

    private S3Service s3 = new S3Service();


    @Transactional
    public Result addOffer() {
        Form<Angebot> submission = formFactory.form(Angebot.class).bindFromRequest();

        //DynamicForm requestData = formFactory.form().bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Form error");
            System.out.println(submission.errors());
            //error ausgeben
        } else {
            Angebot angebot = submission.get();

            System.out.println(angebot.toString());
            JPA.em().persist(angebot);
            JPA.em().flush();


            //Bild hochladen
            Http.MultipartFormData<File> body = request().body().asMultipartFormData();

            List<Http.MultipartFormData.FilePart<File>> bilder = body.getFiles();
            System.out.println("files added");

            if (bilder.size() > 0) {
                for (int i = 0; i < bilder.size(); i++) {
                    if (s3.uploadImage(bilder.get(i).getFile(), bilder.get(i).getFilename())) {
                        System.out.println("image uploaded!");

                        //filename in db schreiben
                        Bild bild = new Bild(bilder.get(i).getFilename(), angebot.getId());
                        JPA.em().persist(bild);
                        JPA.em().flush();

                        angebot.setBild(1);
                        JPA.em().persist(angebot);

                    } else {
                        System.out.println("upload failed!");
                    }
                }
            } else {
                System.out.println("Keine Bild hochgeladen");
            }
        }
        return redirect(routes.Application.index());
    }

    @Transactional(readOnly = true)
    public Result getAngeboteList() {

        List<Angebot> angebote = JPA.em().createQuery("select p from Angebot p").getResultList();

        return ok(toJson(AngeboteAll.buildCompleteOfferFromId(angebote)));
    }

    @Transactional(readOnly = true)
    public Result getAngebote(int id) {
        //TODO select angebot by id
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(toJson(angebote));
    }

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

    public Result getUserRating(int id){
        return ok();
    }

}



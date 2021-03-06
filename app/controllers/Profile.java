package controllers;

import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.*;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static play.mvc.Results.ok;
import static play.libs.Json.*;

/**
 * Created by Fabio on 23.11.2017.
 * Funktionen sind nur Aufrufbar, wenn der Benutzer angemeldet ist, sonst wird eine Fehlermeldung gemäss Secured class zurückgegeben
 */
@Security.Authenticated(Secured.class)
public class Profile extends Controller {

    MailerService mc;

    @Inject
    FormFactory formFactory;

    @Inject
    public Profile(MailerService mailer) {
        this.mc = mailer;
    }

    @Transactional
    public Result index() {
        return ok(views.html.profile.render(Benutzer.findByEmail(request().username())));
    }

    /*
     * Alle Bestellungen des angemeldeten Benutzers anzeigen
     */
    @Transactional
    public Result getOrders(){
        Benutzer rbenutzer = Benutzer.findByEmail(request().username());

        //TODO herausfinden wieso es so nicht funktioniert
        //List<Joins.AngeboteAlle> dbResult = (List<Joins.AngeboteAlle>) JPA.em().createQuery("select an, be, ad, b from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE be.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND an.benutzer_id = b.id AND ad.benutzer_id = b.id").getResultList();

        List<Angebot> dbResultAngebot = JPA.em().createQuery("select an from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE be.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND an.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc ").getResultList();
        List<Bestellung> dbResultBestellung =JPA.em().createQuery("select be from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE be.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND an.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();
        List<Adresse> dbResultAdresse = JPA.em().createQuery("select ad from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE be.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND an.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();
        List<Benutzer> dbResultBenutzer = JPA.em().createQuery("select b from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE be.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND an.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();

        List<Joins.BestellungAlle> bestellungen = new ArrayList<Joins.BestellungAlle>();
        Joins.BestellungAlle bestellung;

        for(int i = 0; i < dbResultAngebot.size(); i++){
            bestellung = new Joins.BestellungAlle();
            bestellung.setBenutzername(dbResultBenutzer.get(i).getBenutzername());
            bestellung.setPlz(dbResultAdresse.get(i).getPlz());
            bestellung.setOrt(dbResultAdresse.get(i).getOrt());
            bestellung.setMenge(dbResultBestellung.get(i).getMenge());
            bestellung.setTitel(dbResultAngebot.get(i).getTitel());
            bestellung.setProzesscode(dbResultBestellung.get(i).getProzesscode());
            bestellung.setDatum(dbResultAngebot.get(i).getDatum());
            bestellung.setBestellungsId(dbResultBestellung.get(i).getId());
            bestellung.setBewToken_besteller(dbResultBestellung.get(i).getBewToken_besteller());

            if(bestellung.getProzesscode() <= 1){
                bestellung.setStrasse("Strasse wird erst nach Bestätigung angezeigt");
            }else if (bestellung.getProzesscode() == 2 || bestellung.getProzesscode() == 3){
                bestellung.setStrasse(dbResultAdresse.get(i).getStrasse());
            }else{
                bestellung.setStrasse("Bestellung ist abgelehnt worden");
            }

            bestellungen.add(i,bestellung);
        }

        return ok(toJson(bestellungen));
    }

    /*
     * Anfrage für ein Angebot (Bestellung) wird akzeptiert,  der besteller erhält eine email mit der adresse des Anbieters
     * Die adresse wird jetzt auch auf der Bestellungsübersicht angezeigt
     */
    @Transactional
    public Result acceptRequest(int bestellungId){
        Benutzer benutzerReq = Benutzer.findByEmail(request().username());
        Benutzer benutzerAng = Benutzer.findByOrder(bestellungId);


        if(benutzerAng.id == benutzerReq.id ){
            //Benutzer ist autorisieret dieses Angebot zu bestätigen

            Bestellung bestellung = Bestellung.findById(bestellungId);

            if(bestellung.getProzesscode() != 2){
                Benutzer besteller = Benutzer.findById(bestellung.getBenutzer_id());
                Adresse adresse = Adresse.findByUserId(benutzerAng.getId());
                bestellung.setProzesscode(2); //Prozersscode auf 2, heisst diese Bestellung ist freigegeben und der Käufer sieht die Adresse
                bestellung.setBewToken_anbieter(UUID.randomUUID().toString());
                bestellung.setBewToken_besteller(UUID.randomUUID().toString());
                bestellung.save();
                mc.sendOrderAccept(benutzerAng.getName(), adresse.getStrasse(), besteller.getEmail() );
            }
            return ok();
        }else{
            return badRequest("nicht authorisiert!");
        }

    }

    @Transactional
    public Result denyRequest(int bestellungId){
        Benutzer benutzerReq = Benutzer.findByEmail(request().username());
        Benutzer benutzerAng = Benutzer.findByOrder(bestellungId);

        if(benutzerAng.getId() == benutzerReq.getId()){
            //Benutzer ist autorisieret dieses Angebot zu bestätigen
            Bestellung bestellung = Bestellung.findById(bestellungId);
            if(bestellung.getProzesscode() != 10){
                Benutzer besteller = Benutzer.findById(bestellung.getBenutzer_id());
                bestellung.setProzesscode(10); //Prozersscode auf 10, heisst bestellung wurde abgelehnt
                bestellung.save();
                mc.sendOrderDeny(besteller.getEmail());
            }

            return ok();
        }else{
            return badRequest("nicht authorisiert!");
        }
    }

    /*
     * Alle Anfragen des angemeldeten Benutzers zurückgegeben
     */
    @Transactional
    public Result getRequests(){
        Benutzer rbenutzer = Benutzer.findByEmail(request().username());

        List<Angebot> dbResultAngebot = JPA.em().createQuery("select an from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE an.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND be.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();
        List<Bestellung> dbResultBestellung =JPA.em().createQuery("select be from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE an.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND be.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();
        List<Adresse> dbResultAdresse = JPA.em().createQuery("select ad from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE an.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND be.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();
        List<Benutzer> dbResultBenutzer = JPA.em().createQuery("select b from Angebot an, Bestellung be, Benutzer b, Adresse ad WHERE an.benutzer_id = "+rbenutzer.getId()+" AND be.angebot_id = an.id AND be.benutzer_id = b.id AND ad.benutzer_id = b.id order by be.id desc").getResultList();

        List<Joins.AnfragenAlle> anfragen = new ArrayList<Joins.AnfragenAlle>();
        Joins.AnfragenAlle anfrage;

        for(int i = 0; i < dbResultAngebot.size(); i++){
            anfrage = new Joins.AnfragenAlle();
            anfrage.setBenutzername(dbResultBenutzer.get(i).getBenutzername());
            anfrage.setPlz(dbResultAdresse.get(i).getPlz());
            anfrage.setOrt(dbResultAdresse.get(i).getOrt());
            anfrage.setMenge(dbResultBestellung.get(i).getMenge());
            anfrage.setTitel(dbResultAngebot.get(i).getTitel());
            anfrage.setProzesscode(dbResultBestellung.get(i).getProzesscode());
            anfrage.setDatum(dbResultAngebot.get(i).getDatum());
            anfrage.setBestellungsId(dbResultBestellung.get(i).getId());
            anfrage.setName(dbResultBenutzer.get(i).getName());
            anfrage.setStrasse(dbResultAdresse.get(i).getStrasse());
            anfrage.setBewToken_anbieter(dbResultBestellung.get(i).getBewToken_anbieter());

            anfragen.add(i,anfrage);
        }

        return ok(toJson(anfragen));
    }

    /*
     * ALle Aerstellten Angebote des angemeldeten Benutzers zurückgeben
     */
    @Transactional
    public Result getOffers(){
        Benutzer benutzer = Benutzer.findByEmail(request().username());

        List<Angebot> angebote = JPA.em().createQuery("select a from Angebot a where a.benutzer_id ="+ benutzer.getId()).getResultList();
        return ok(toJson(AngeboteAll.buildCompleteOfferFromId(angebote)));
    }

    /*
     * Eine abgeschlossene Bestellung bewerten, token für die Bewertung müssen übereinstimmen, damit bewertung nicht 2mal gemacht werden kann
     * Besteller und anbieter können sich gegenseitig bewerten über diese Funktion
     * Parameter url: id der Bestellung
     * POST: token: einmaliges request token
     *       who: besteller oder anbieter
     *       rating: die gewählte Bewertung 1-5
     */
    @Transactional
    public Result rateOrder(int id){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String token = requestData.get("token");
        String who = requestData.get("who");
        String rating = requestData.get("rating");

        int bewReq = Integer.parseInt(rating);

        //Benutzer benutzerReq = Benutzer.findByEmail(request().username());
        Bestellung bestellung = Bestellung.findById(id);

        if(who.equals("besteller") && token.equals(bestellung.getBewToken_besteller()) && token != null){
           if(token.equals("rated")){
               return badRequest("Bewertung wurde bereits abgegeben");
           }

            Benutzer benutzerBew = Benutzer.findByOrder(id);
            double bew = benutzerBew.getBewertung();
            int anzBew = benutzerBew.getAnzBewertung();
            double bewNeu = (bew * anzBew + bewReq) / (anzBew + 1);
            benutzerBew.setBewertung(bewNeu);
            benutzerBew.setAnzBewertung(anzBew + 1);
            benutzerBew.save();
            //Token auf rated setzen, damit die Bewertung kein 2. Mal gemacht werden kann.
            bestellung.setBewToken_besteller("rated");
            bestellung.save();

            //TODO nach einmaliger bewertung kein bewertung button mehr anzeigen
            return ok();
        }else if(who.equals("anbieter") && token.equals(bestellung.getBewToken_anbieter()) && token != null){
            //Analog zu Funktion oben, aber für den Anbieter der Bestellung

            if(token.equals("rated")){
                return badRequest("Bewertung wurde bereits abgegeben");
            }
            Benutzer benutzerBew = Benutzer.findById(bestellung.getBenutzer_id());
            double bew = benutzerBew.getBewertung();
            int anzBew = benutzerBew.getAnzBewertung();
            double bewNeu = (bew * anzBew + bewReq) / (anzBew + 1);
            benutzerBew.setBewertung(bewNeu);
            benutzerBew.setAnzBewertung(anzBew + 1);
            benutzerBew.save();

            bestellung.setBewToken_anbieter("rated");
            bestellung.save();

            return ok();
        }else{
            //Wenn der Token nicht übereinstimmt, dh eine ungültige Bewertung abgegeben wird
            return badRequest("Ungültige Anfrage!");
        }

    }

}

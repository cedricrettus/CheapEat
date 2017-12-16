package controllers;

import models.Angebot;
import models.Benutzer;
import models.Bestellung;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;

import static play.mvc.Results.ok;

/**
 * Created by Fabio on 27.10.2017.
 */
@Security.Authenticated(Secured.class)
public class BestellungController extends Controller {

    //MailerService um EMails über gmail smtp zu senden
    MailerService mc;

    @Inject
    public BestellungController(MailerService mailer) {
        this.mc = mailer;
    }

    @Inject
    FormFactory formFactory;

    @Transactional
    public Result getBestellung(){
        return null;
    }

    /*
     * Eine Bestellung wird erstellt, vom Client wird die Angebots ID und die gewünschte Menge übermittelt
     * Ein Mail wird versendet, das den Anbieter informiert, das eine Anfrage für eine Bestellung gemacht wurde
     * Bestellung muss zuerst vom Anbieter bestätigt werden
     */
    @Transactional
    public Result addBestellung() {

        //Benutzer der die Bestellung tätigt
        Benutzer benutzer = Benutzer.findByEmail(request().username());

        Bestellung bestellung = formFactory.form(Bestellung.class).bindFromRequest().get();

        //Angebot, das bestellt wird
        Angebot angebot = Angebot.findById(bestellung.getAngebot_id());


        //Nicht vorhandene Angebots id wird im POST gesendet
        if(angebot == null){
            return badRequest("Ungültige Anfrage, Angebot nicht vorhanden!");
        }
        //Benutzer darf nicht sein eigenes Angebot bestellen
        if(angebot.getBenutzer_id() == benutzer.getId()){
            return badRequest("Fehler! Eigenes Angebot kann nicht bestellt werden!");
        }
        if(bestellung.getMenge() > angebot.getMengeVerfuegbar()){
            return badRequest("Nicht mehr genügend Portionen verfügbar");
        }

        bestellung.setProzesscode(1);
        bestellung.setBenutzer_id(benutzer.getId());

        //Verfügbare Menge des Angebots anpassen, wird wieder zurückgesetzt, falls die anfrage abgelehnt wird
        angebot.setMengeVerfuegbar(angebot.getMengeVerfuegbar() - bestellung.getMenge());
        angebot.save();

        bestellung.save();
        JPA.em().flush();

        Benutzer anbieter = Benutzer.findById(angebot.getBenutzer_id());

        System.out.println(benutzer.getEmail());
        //TODO email wieder entkommentieren
        //mc.sendOrderNotification(anbieter.getEmail(), benutzer.getEmail());
        return ok();
    }

}

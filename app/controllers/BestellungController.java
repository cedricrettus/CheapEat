package controllers;

import models.Angebot;
import models.Benutzer;
import models.Bestellung;
import play.data.FormFactory;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

import static play.mvc.Results.ok;

/**
 * Created by Fabio on 27.10.2017.
 */
public class BestellungController extends Controller {

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

    @Transactional
    public Result addBestellung() {

        //TODO class secured, dann über getusername()

        //Beispiel um FormData zu holen das nicht zu einem Model gehört!
        //DynamicForm requestData = formFactory.form().bindFromRequest();
        //String firstname = requestData.get("firstname");

        //TODO prüfen ob bestellmenge verfügbar ist

        if(session("email").isEmpty()){
            //TODO nutzer soll sich anmelden um die bestellung fortzuführen
            return badRequest("Bitte anmelden um zu bestellen");
        }

        Benutzer benutzer = Benutzer.findByEmail(session("email"));

        Bestellung bestellung = formFactory.form(Bestellung.class).bindFromRequest().get();
        bestellung.prozesscode = 1;
        bestellung.benutzer_id = benutzer.getId();

        JPA.em().persist(bestellung);
        JPA.em().flush();
        int id =  bestellung.id;

        System.out.println(id);

        Angebot angebot1 = JPA.em().find(Angebot.class, bestellung.angebot_id);
        System.out.println(angebot1.email);
        System.out.println(benutzer.getEmail());
        mc.sendOrderNotification(angebot1.email, benutzer.getEmail());
        return ok();
    }
}

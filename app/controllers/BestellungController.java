package controllers;

import models.Angebot;
import models.Bestellung;
import play.data.FormFactory;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Result;

import javax.inject.Inject;

import static play.mvc.Results.ok;

/**
 * Created by Fabio on 27.10.2017.
 */
public class BestellungController {

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

        //Beispiel um FormData zu holen das nicht zu einem Model gehört!
        //DynamicForm requestData = formFactory.form().bindFromRequest();
        //String firstname = requestData.get("firstname");

        Bestellung bestellung = formFactory.form(Bestellung.class).bindFromRequest().get();
        bestellung.prozesscode = 1;
        bestellung.benutzer_id = 0;

        JPA.em().persist(bestellung);
        JPA.em().flush();
        int id =  bestellung.id;

        System.out.println(id);

        Angebot angebot1 = JPA.em().find(Angebot.class, bestellung.angebot_id);
        System.out.println(angebot1.email);
        System.out.println(bestellung.email);
        mc.sendOrderNotification(angebot1.email, bestellung.email);
        return ok();

    }
}

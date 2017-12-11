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

        //TODO prüfen ob bestellmenge verfügbar ist


        Benutzer benutzer = Benutzer.findByEmail(request().username());

        Bestellung bestellung = formFactory.form(Bestellung.class).bindFromRequest().get();
        bestellung.prozesscode = 1;
        bestellung.benutzer_id = benutzer.getId();

        JPA.em().persist(bestellung);
        JPA.em().flush();
        int id =  bestellung.id;

        System.out.println(id);

        Angebot angebot1 = JPA.em().find(Angebot.class, bestellung.angebot_id);
        Benutzer anbieter = Benutzer.findById(bestellung.benutzer_id);

        System.out.println(benutzer.getEmail());
        mc.sendOrderNotification(anbieter.getEmail(), benutzer.getEmail());
        return ok();
    }






}

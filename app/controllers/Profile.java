package controllers;

import models.Angebot;
import models.AngebotUrls;
import models.Benutzer;
import models.Bestellung;
import play.db.jpa.*;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

import static play.mvc.Results.ok;
import static play.libs.Json.*;

/**
 * Created by Fabio on 23.11.2017.
 */
@Security.Authenticated(Secured.class)
public class Profile extends Controller {

    @Transactional
    public Result index() {
        return ok(views.html.profile.render(Benutzer.findByEmail(request().username())));
    }

    @Transactional
    public Result getOrdersBuy(){
        Benutzer benutzer = Benutzer.findByEmail(request().username());

        List<Bestellung> bestellungen = JPA.em().createQuery("select b from Bestellung b where b.benutzer_id ="+benutzer.getId()).getResultList();

        return ok(toJson(bestellungen));
    }

    @Transactional
    public Result getOrdersSell(){
        Benutzer benutzer = Benutzer.findByEmail(request().username());

        List<Bestellung> bestellungen = JPA.em().createQuery("select b from Bestellung b where b.benutzer_id ="+benutzer.getId()).getResultList();

        return ok(toJson(bestellungen));
    }

    @Transactional
    public Result getOffers(){
        Benutzer benutzer = Benutzer.findByEmail(request().username());

        List<Angebot> angebote = JPA.em().createQuery("select a from Angebot a where a.benutzer_id ="+ benutzer.getId()).getResultList();
        return ok(toJson(AngebotUrls.buildUrlsFromOffers(angebote)));
    }

    public Result editOffer(){
        Benutzer benutzer = Benutzer.findByEmail(request().username());


        return ok();
    }
}

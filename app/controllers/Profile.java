package controllers;

import models.*;
import play.db.jpa.*;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.ArrayList;
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

            if(bestellung.getProzesscode() <= 1){
                bestellung.setStrasse("Strasse wird erst nach bestätigung angezeigt");
            }else {
                bestellung.setStrasse(dbResultAdresse.get(i).getStrasse());
            }

            bestellungen.add(i,bestellung);
        }

        return ok(toJson(bestellungen));
    }

    @Transactional
    public Result getRequests(){
        Benutzer rbenutzer = Benutzer.findByEmail(request().username());

        //TODO anfragen in model joins auslagern
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

            anfragen.add(i,anfrage);
        }

        return ok(toJson(anfragen));
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

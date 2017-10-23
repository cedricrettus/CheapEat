package controllers;

import models.Angebot;
import play.data.Form;
import play.mvc.*;
import play.db.jpa.*;
import views.html.*;
import play.data.FormFactory;
import javax.inject.Inject;
import java.util.List;
import play.data.validation.Constraints;

import static play.libs.Json.*;
import static views.html.suche.*;

public class Application extends Controller {

    public static class CreateAngebot {
        @Constraints.Required
        public String titel;
        @Constraints.Required
        @Constraints.Min(0)
        public Double preis;

        @Constraints.Required
        @Constraints.Min(0)
        public Double menge;

        public void setName(String name) {
            this.titel = name;
        }

        public void setPrice(Double price) {
            this.preis = preis;
        }

        public String getTitel() {
            return this.titel;
        }

        public Double getPreis() {
            return this.preis;
        }
    }

    @Inject
    FormFactory formFactory;

    @Transactional
    public Result index() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(views.html.index.render(angebote));
    }

    @Transactional
    public Result addAngebot() {
        // TODO change to Angebot
        Form<Angebot> submission = formFactory.form(Angebot.class).bindFromRequest();
        if(submission.hasErrors()){
            System.out.println("Form error");
            System.out.println(submission.errors());
            //error ausgeben
        }else{
            Angebot angebot = submission.get();

            System.out.println(angebot.toString());
            JPA.em().persist(angebot);

        }
        return redirect(routes.Application.index());
    }

    @Transactional(readOnly = true)
    public Result getAngebote() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(toJson(angebote));
    }

    @Transactional(readOnly = true)
    public Result suchePlz(int plz) {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p where p.plz = "+ plz +"").getResultList();
        return ok(toJson(angebote));
    }

    @Transactional(readOnly = true)
    public Result suche(int plz){
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p where p.plz = "+ plz +"").getResultList();
        return ok(views.html.suche.render(angebote));
    }
}

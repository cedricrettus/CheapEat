package controllers;

import models.Angebot;
import models.Bestellung;
import play.api.libs.mailer.MailerClient;
import play.data.DynamicForm;
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

public class AngebotController extends Controller {


    @Inject
    FormFactory formFactory;

    @Transactional
    public Result index() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(views.html.index.render(angebote));
    }

    @Transactional
    public Result addAngebot() {
        // TODO auslagern in db controller addAngebot()
        Form<Angebot> submission = formFactory.form(Angebot.class).bindFromRequest();
        if (submission.hasErrors()) {
            System.out.println("Form error");
            System.out.println(submission.errors());
            //error ausgeben
        } else {
            Angebot angebot = submission.get();

            System.out.println(angebot.toString());
            JPA.em().persist(angebot);

        }
        return redirect(routes.AngebotController.index());
    }

    @Transactional(readOnly = true)
    public Result getAngeboteList() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(toJson(angebote));
    }

    @Transactional(readOnly = true)
    public Result getAngebote(int id) {
        //TODO select angebot by id
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(toJson(angebote));
    }

    @Transactional(readOnly = true)
    public Result sucheAngebot(int plz) {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p where p.plz = " + plz).getResultList();
        return ok(views.html.suche.render(angebote));
    }

}

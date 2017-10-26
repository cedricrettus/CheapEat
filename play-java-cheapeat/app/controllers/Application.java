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

public class Application extends Controller {


    MailerService mc;

    @Inject
    public Application(MailerService mailer) {
        this.mc = mailer;
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
        return redirect(routes.Application.index());
    }

    @Transactional(readOnly = true)
    public Result getAngebote() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(toJson(angebote));
    }

    @Transactional(readOnly = true)
    public Result suche(int plz) {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p where p.plz = " + plz).getResultList();
        return ok(views.html.suche.render(angebote));
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
        mc.sendEmail(angebot1.email, bestellung.email);
        return ok();

    }

}

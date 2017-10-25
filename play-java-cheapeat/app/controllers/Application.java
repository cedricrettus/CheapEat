package controllers;

import models.Angebot;
import models.Bestellung;
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

    @Transactional
    public Result addBestellung(){

        //Beispiel um FormData zu holen das nicht zu einem Model gehört!
        //DynamicForm requestData = formFactory.form().bindFromRequest();
        //String firstname = requestData.get("firstname");


        Bestellung bestellung = formFactory.form(Bestellung.class).bindFromRequest().get();
        bestellung.prozesscode = 1;
        bestellung.benutzer_id = 0;

        JPA.em().persist(bestellung);

        return ok();
    }
}

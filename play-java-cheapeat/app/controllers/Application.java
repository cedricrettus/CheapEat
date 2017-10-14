package controllers;

import models.Angebot;
import play.mvc.*;
import play.db.jpa.*;
import views.html.*;
import play.data.FormFactory;
import javax.inject.Inject;
import java.util.List;

import static play.libs.Json.*;

public class Application extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index() {
        return ok(index.render());
    }

    @Transactional
    public Result addAngebot() {
        Angebot angebot = formFactory.form(Angebot.class).bindFromRequest().get();
        JPA.em().persist(angebot);
        return redirect(routes.Application.index());
    }

    @Transactional(readOnly = true)
    public Result getAngebote() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(toJson(angebote));
    }
}

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
import java.io.File;
import java.util.List;
import play.data.validation.Constraints;
import com.amazonaws.auth.*;
import com.amazonaws.services.s3.*;
import com.amazonaws.services.s3.model.*;

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

        //DynamicForm requestData = formFactory.form().bindFromRequest();
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();

        // TODO auslagern in db controller addAngebot()
        Form<Angebot> submission = formFactory.form(Angebot.class).bindFromRequest();

        List<Http.MultipartFormData.FilePart<File>> bilder = body.getFiles();

        System.out.println("files added");

        System.out.println("files added 2");

        for(int i = 0; i < bilder.size(); i++){
            S3Service.uploadImage(bilder.get(i).getFile());
        }

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

package controllers;

import models.Angebot;
import models.Bild;
import models.Bilderangebote;
import play.data.Form;
import play.mvc.*;
import play.db.jpa.*;
import play.data.FormFactory;
import views.html.suche;

import javax.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static play.libs.Json.*;

public class AngebotController extends Controller {


    @Inject
    FormFactory formFactory;

    private S3Service s3 = new S3Service();

    @Transactional
    public Result index() {
        List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p from Angebot p").getResultList();
        return ok(views.html.index.render(angebote));
    }

    @Transactional
    public Result addAngebot() {
        Form<Angebot> submission = formFactory.form(Angebot.class).bindFromRequest();

        //DynamicForm requestData = formFactory.form().bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Form error");
            System.out.println(submission.errors());
            //error ausgeben
        } else {
            Angebot angebot = submission.get();

            System.out.println(angebot.toString());
            JPA.em().persist(angebot);
            JPA.em().flush();


            //Bild hochladen
            Http.MultipartFormData<File> body = request().body().asMultipartFormData();
            // TODO auslagern in db controller addAngebot()

            List<Http.MultipartFormData.FilePart<File>> bilder = body.getFiles();
            System.out.println("files added");

            if (bilder.size() > 0) {
                for (int i = 0; i < bilder.size(); i++) {
                    if (s3.uploadImage(bilder.get(i).getFile(), bilder.get(i).getFilename())) {
                        System.out.println("image uploaded!");

                        //filename in db schreiben
                        Bild bild = new Bild(bilder.get(i).getFilename());
                        JPA.em().persist(bild);
                        JPA.em().flush();

                        Bilderangebote ba = new Bilderangebote(angebot.getId(), bild.getId());
                        JPA.em().persist(ba);

                        angebot.setBild(1);
                        JPA.em().persist(angebot);

                    } else {
                        System.out.println("upload failed!");
                    }
                }
            } else {
                System.out.println("Keine Bild hochgeladen");
            }
        }
        return redirect(routes.AngebotController.index());
    }

    @Transactional(readOnly = true)
    public Result getAngeboteList() {

        //List angebote = JPA.em().createQuery("select p, y.url from Angebot p, Bilderangebote x, Bild y where (x.angebote_id = p.id and x.bilder_id = y.id and p.bild = 1)").getResultList();

        List angebote = JPA.em().createQuery("select p from Angebot p").getResultList();

        for(int i = 0; i < angebote.size(); i++){
                List urls = JPA.em().createQuery("select b.url from Bild b, Bilderangebote ba where ba.angebote_id ="+ angebote.get(i) +" and  ba.bilder_id = b.id").getResultList();
                if(urls.size() > 0){
                    angebote.add(i, urls);
                }

        }


        //List alleAngebote = new ArrayList<Object>(angeboteMBild);
        //alleAngebote.addAll(angeboteOBild);


        System.out.println("test");

        //List<Angebot> angebote = (List<Angebot>) JPA.em().createQuery("select p, x, y from Angebot p, Bilderangebote x, Bild y where (x.angebote_id = p.id and x.bilder_id = y.id) or p.bild = 0").getResultList();
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
        return ok(suche.render(angebote));
    }

}

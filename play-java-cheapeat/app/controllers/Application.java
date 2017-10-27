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
import static play.mvc.Results.ok;
import static views.html.suche.*;

/**
 * Created by Fabio on 27.10.2017.
 */
public class Application {

    public Result imageUpload(){

        return ok(views.html.upload.render());
    }
}

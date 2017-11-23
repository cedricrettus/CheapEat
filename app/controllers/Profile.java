package controllers;

import models.Benutzer;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import static play.mvc.Results.ok;

/**
 * Created by Fabio on 23.11.2017.
 */
@Security.Authenticated(Secured.class)
public class Profile extends Controller {

    public Result index() {
        return ok(views.html.profile.render(Benutzer.findByEmail(request().username())));
    }
}

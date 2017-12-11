package controllers;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        if(ctx._requestHeader().path().toLowerCase().equals("/profile")){
            return redirect(routes.Application.login());
        }else{
            return badRequest("Benutzer muss angemeldet sein - <a href='/login'>Hier anmelden</a>" );
        }


    }
}

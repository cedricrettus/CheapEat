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
        //Wenn unauthorisiert über einen Link auf das Profil aufgerufen wird, wird auf die login seite umgeleitet, sonst wird ein Fehler gesendet
        if(ctx._requestHeader().path().toLowerCase().equals("/profile")){
            return redirect(routes.Application.login());
        }else{
            return forbidden("Benutzer muss angemeldet sein - <a href='/login'>Hier anmelden</a>" );
        }

    }
}

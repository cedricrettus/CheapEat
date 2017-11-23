package controllers;

import models.Benutzer;
import models.utils.AppException;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

import static play.data.Form.form;
import static play.mvc.Controller.session;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;


public class Authentication {

    @Inject
    FormFactory formFactory;


    public static Result GO_HOME = redirect(
            routes.Application.index()
    );

    public static Result GO_DASHBOARD = redirect(
            routes.Profile.index()
    );

    /**
     * Display the login page or dashboard if connected
     *
     * @return login page or dashboard
     */
 /*   public Result index() {
        // Check that the email matches a confirmed user before we redirect
        String email = ctx().session().get("email");
        if (email != null) {
            User user = User.findByEmail(email);
            if (user != null && user.validated) {
                return GO_DASHBOARD;
            } else {
                Logger.debug("Clearing invalid session credentials");
                session().clear();
            }
        }

        return ok(index.render(form(Register.class), form(Login.class)));
    }
    */

    /**
     * Login class used by Login Form.
     */
    public static class Login {

        @Constraints.Required
        public String email;
        @Constraints.Required
        public String password;

        /**
         * Validate the authentication.
         *
         * @return null if validation ok, string with details otherwise
         */

        public String validate() {

            Benutzer benutzer;
            try {
                benutzer = Benutzer.authenticate(email, password);
            } catch (AppException e) {
                return ("servererror");
            }
            if (benutzer == null) {
                return ("invalid.user.or.password");
            } else if (benutzer.validiert != 1) {
                return ("account.not.validated.check.mail");
            }
            return null;
        }


    }

    public static class Register {

        @Constraints.Required
        public String email;

        @Constraints.Required
        public String name;

        @Constraints.Required
        public String passwort;

        @Constraints.Required
        public String benutzername;

        /**
         * Validate the authentication.
         *
         * @return null if validation ok, string with details otherwise
         */


        public String validate() {
            if (isBlank(email)) {
                return "Email is required";
            }

            if (isBlank(name)) {
                return "Full name is required";
            }

            if (isBlank(passwort)) {
                return "Password is required";
            }

            return null;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPasswort() {
            return passwort;
        }

        public void setPasswort(String passwort) {
            this.passwort = passwort;
        }

        public String getBenutzername() {
            return benutzername;
        }

        public void setBenutzername(String benutzername) {
            this.benutzername = benutzername;
        }

        private boolean isBlank(String input) {
            return input == null || input.isEmpty() || input.trim().isEmpty();
        }
    }

    /**
     * Handle login form submission.
     *
     * @return Dashboard if auth OK or login form if auth KO
     */
    public Result authenticate() {
        Form<Authentication.Login> submission = formFactory.form(Authentication.Login.class).bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Login error");
            System.out.println(submission.errors());
            //TODO error zurückgeben
            return badRequest();
        } else {
            session("email", submission.get().email);
            return GO_DASHBOARD;
        }
    }

    /**
     * Logout and clean the session.
     *
     * @return Index page
     */
/*    public Result logout() {
        session().clear();
        flash("success", Messages.get("youve.been.logged.out"));
        return GO_HOME;
    }*/
}

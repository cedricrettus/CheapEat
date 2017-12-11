package controllers;

import models.Benutzer;
import models.utils.AppException;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.data.validation.Constraints;
import play.db.jpa.Transactional;
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

    public static Result GO_PROFILE = redirect(
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
        public String passwort;

       //Login validieren, prüft ob eingegebenes Passwort übereinstimmt und ob der Benutzer validiert ist.

        public String validate() {

            Benutzer benutzer;
            try {
                benutzer = Benutzer.authenticate(email, passwort);
            } catch (AppException e) {
                return ("Server error");
            }
            if (benutzer == null) {
                return ("Falsches Email oder Passwort");
            } else if (benutzer.validiert != 1) {
                return ("Account ist nicht validiert, mit Email bestätigen");
            }
            return null;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPasswort() {
            return passwort;
        }

        public void setPasswort(String passwort) {
            this.passwort = passwort;
        }
    }

    public static class Register {

        @Constraints.Required
        @Constraints.Email
        public String email;

        @Constraints.Required
        public String name;

        @Constraints.Required
        @Constraints.MinLength(7)
        public String passwort;

        @Constraints.Required
        public String benutzername;

        public String strasse;
        public int plz;
        public String ort;

        //Validierung des Registrierungsformular
        public String validate() {
            if (isBlank(email)) {
                return "Email wird benötigt";
            }

            if (isBlank(name)) {
                return "Name wird benötigt";
            }

            if (isBlank(passwort)) {
                return "Passwort wird benötigt";
            }

            return null;
        }

        public String getStrasse() {
            return strasse;
        }

        public void setStrasse(String strasse) {
            this.strasse = strasse;
        }

        public int getPlz() {
            return plz;
        }

        public void setPlz(int plz) {
            this.plz = plz;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
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

    //Login Formular wird ausgewertet, wenn validation ok -> session mit login email wird erstellt
    @Transactional
    public Result authenticate() {
        Form<Authentication.Login> submission = formFactory.form(Authentication.Login.class).bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Login error");
            System.out.println(submission.errors());
            //TODO error zurückgeben
            return badRequest("Login error");
        } else {
            session("email", submission.get().email);
            return GO_PROFILE;
        }
    }

    //Benutzer ausloggen, session wird geleert
    public Result logout() {
        session().clear();
        return GO_HOME;
    }
}

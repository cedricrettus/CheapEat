package controllers;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import controllers.Application;
import controllers.Authentication;
import controllers.MailerService;
import models.Adresse;
import models.Benutzer;
import models.utils.AppException;
import models.utils.Hash;
import org.apache.commons.mail.EmailException;
import play.Configuration;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.db.jpa.Transactional;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;

import javax.inject.Inject;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import static play.data.Form.form;



/**
 * Signup to PlayStartApp : save and send confirm mail.
 * <p/>
 * User: yesnault
 * Date: 31/01/12
 */
public class Signup extends Controller {


    MailerService mc;

    @Inject
    public Signup(MailerService mailer) {
        this.mc = mailer;
    }

    @Inject
    FormFactory formFactory;

    Config conf = ConfigFactory.load();

    /*
     * Rendert das Registrierungsformular
     */
    public Result create() {
        return ok(views.html.register.render());
    }


    /*
     * Der neue Benutzer wird über die eingebane der Register Form erstellt.
     */
    @Transactional
    public Result save() {

        Form<Authentication.Register> submission = formFactory.form(Authentication.Register.class).bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Form error");
            System.out.println(submission.errors());
            //TODO error zurückgeben
            return badRequest(submission.errorsAsJson());
        } else {

            Authentication.Register register = submission.get();
            Result resultError1 = checkBeforeSaveEmail(submission, register.getEmail());
            Result resultError2 = checkBeforeSaveEmail(submission, register.getBenutzername());

            if (resultError1 != null) return resultError1;
            if (resultError2 != null) return resultError2;

            try {
                Benutzer benutzer = new Benutzer();
                benutzer.setEmail(register.getEmail());
                benutzer.setName(register.getName());
                benutzer.setPwhash(Hash.createPassword(register.getPasswort()));
                benutzer.setBenutzername(register.getBenutzername());
                benutzer.setValidiert(0);
                benutzer.setConfirmationToken(UUID.randomUUID().toString());

                Adresse adresse = new Adresse();
                adresse.setOrt(register.getOrt());
                adresse.setPlz(register.getPlz());
                adresse.setStrasse(register.getStrasse());

                adresse.save();
                benutzer.save();
                sendMailAskForConfirmation(benutzer);

                return ok("erstellt");
            } catch (EmailException e) {
                Logger.debug("Signup.save Cannot send email", e);
                            } catch (Exception e) {
                Logger.error("Signup.save error", e);
            }
            return badRequest("servererror");
        }

    }

    /*
     * Prüft ob die Email bereits existiert
     */
    @Transactional
    private Result checkBeforeSaveEmail(Form<Authentication.Register> registerForm, String email) {
        // Check unique email
        if (Benutzer.findByEmail(email) != null) {
            return badRequest("Ein Benutzer mit dieser Email Adresse existiert bereits");
        }

        return null;
    }

    /*
     * Prüft ob ein Benutzer mit diesem Benutzername bereits exisitert
     */
    @Transactional
    private Result checkBeforeSaveName(Form<Authentication.Register> registerForm, String benutzername) {
        // Check unique email
        if (Benutzer.findByUsername(benutzername) != null) {
            return badRequest("Ein Benutzer mit dieser Email Adresse existiert bereits");
        }
        return null;
    }


    /*
     * Sendet eine Email, die ein Link mit dem Bestätigungstoken verschickt, damit der Benutzer via Email sein Account validieren kann
     */
    @Transactional
    private void sendMailAskForConfirmation(Benutzer benutzer) throws EmailException, MalformedURLException {

        String  urlString = "http://" + conf.getString("server.hostname");

        urlString += "/confirm/" + benutzer.getConfirmationToken();
        URL url = new URL(urlString); //Throws Exception falls die URL falsch erstellt wurden

        mc.sendRegistrationInfo(url, benutzer.getEmail());

    }

    /*
     * Wenn der Benutzer sein Bestätigungslink aufruft, wird das Token abgeglichen und der Benutzer wird auf validiert gesetzt
     */
    @Transactional
    public Result confirm(String token) {
        Benutzer benutzer = Benutzer.findByConfirmationToken(token);
        if (benutzer == null) {
            return badRequest(views.html.confirm.render("Unbekannter Benutzer"));
        }

        if (benutzer.validiert == 1) {
            return badRequest(views.html.confirm.render("Benutzer ist bereits validiert"));
        }

        try {
            if (Benutzer.confirm(benutzer)) {
                //Mail an den Benutzer senden, dass dieser erfolgreich validiert wurde
                mc.sendValidationConfirmation(benutzer.getEmail());

                return ok(views.html.confirm.render("ok"));
            } else {
                return badRequest(views.html.confirm.render("Server Error"));
            }
        } catch (AppException e) {
            return badRequest(views.html.confirm.render("Server Error"));
        }

    }


}

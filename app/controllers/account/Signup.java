package controllers.account;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import controllers.Application;
import controllers.Authentication;
import controllers.MailerService;
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

    /**
     * Display the create form.
     *
     * @return create form
     */
    public Result create() {
        return ok(views.html.register.render());
    }

    /**
     * Display the create form only (for the index page).
     *
     * @return create form
     */
    /*public Result createFormOnly() {
        return ok(create.render(form(Authentication.Register.class)));
    }*/

    /**
     * Save the new user.
     *
     * @return Successfull page or created form if bad
     */
    @Transactional
    public Result save() {
        //Form<Authentication.Register> registerForm = form(Authentication.Register.class).bindFromRequest();

        Form<Authentication.Register> submission = formFactory.form(Authentication.Register.class).bindFromRequest();

        //DynamicForm requestData = formFactory.form().bindFromRequest();

        //Form auf Errors prüfen
        if (submission.hasErrors()) {
            System.out.println("Form error");
            System.out.println(submission.errors());
            //TODO error zurückgeben
        } else {

            Authentication.Register register = submission.get();
            Result resultError = checkBeforeSave(submission, register.email);

            if (resultError != null) {
                return resultError;
            }

            try {
                Benutzer benutzer = new Benutzer();
                benutzer.email = register.email;
                benutzer.name = register.name;
                benutzer.pwhash = Hash.createPassword(register.passwort);
                benutzer.benutzername = register.benutzername;
                benutzer.validiert = 0;
                benutzer.confirmationToken = UUID.randomUUID().toString();

                benutzer.save();
                sendMailAskForConfirmation(benutzer);

                return ok(views.html.created.render());
            } catch (EmailException e) {
                Logger.debug("Signup.save Cannot send email", e);
                flash("error", Messages.get("error.sending.email"));
            } catch (Exception e) {
                Logger.error("Signup.save error", e);
                flash("error", Messages.get("error.technical"));
            }
            return badRequest(views.html.register.render());
        }

        //richtige confirm seite zurückgeben
        return ok("user erstellt");
    }

    /**
     * Check if the email already exists.
     *
     * @param registerForm User Form submitted
     * @param email        email address
     * @return Index if there was a problem, null otherwise
     */
    @Transactional
    private Result checkBeforeSave(Form<Authentication.Register> registerForm, String email) {
        // Check unique email
        if (Benutzer.findByEmail(email) != null) {
            flash("error", Messages.get("error.email.already.exist"));
            return badRequest();
        }

        return null;
    }


    /**
     * Send the welcome Email with the link to confirm.
     *
     * @param benutzer user created
     * @throws EmailException Exception when sending mail
     */
    @Transactional
    private void sendMailAskForConfirmation(Benutzer benutzer) throws EmailException, MalformedURLException {
        //String subject = Messages.get("mail.confirm.subject");

        String  urlString = "http://" + conf.getString("server.hostname");
        //String urlString = "http://" + Configuration.root().getString("server.hostname");
        urlString += "/confirm/" + benutzer.confirmationToken;
        URL url = new URL(urlString); // validate the URL, will throw an exception if bad.
        //String message = Messages.get("mail.confirm.message", url.toString());

        //TODO korrektes Mails senden für angefragte registrierung
        mc.sendRegistrationInfo(url, benutzer.email);

        /*Mail.Envelop envelop = new Mail.Envelop(subject, message, user.email);
        Mail mailer = new Mail(mailerClient);
        mailer.sendMail(envelop);*/
    }

    /**
     * Valid an account with the url in the confirm mail.
     *
     * @param token a token attached to the user we're confirming.
     * @return Confirmationpage
     */
    @Transactional
    public Result confirm(String token) {
        Benutzer benutzer = Benutzer.findByConfirmationToken(token);
        if (benutzer == null) {
            flash("error", Messages.get("error.unknown.email"));
            return badRequest(views.html.confirm.render());
        }

        if (benutzer.validiert == 1) {
            flash("error", Messages.get("error.account.already.validated"));
            return badRequest(views.html.confirm.render());
        }

        try {
            if (Benutzer.confirm(benutzer)) {
                sendMailConfirmation(benutzer);
                flash("success", Messages.get("account.successfully.validated"));
                return ok(views.html.confirm.render());
            } else {
                Logger.debug("Signup.confirm cannot confirm user");
                flash("error", Messages.get("error.confirm"));
                return badRequest(views.html.confirm.render());
            }
        } catch (AppException e) {
            Logger.error("Cannot signup", e);
            flash("error", Messages.get("error.technical"));
        } catch (EmailException e) {
            Logger.debug("Cannot send email", e);
            flash("error", Messages.get("error.sending.confirm.email"));
        }
        return badRequest(views.html.confirm.render());
    }

    /**
     * Send the confirm mail.
     *
     * @param user user created
     * @throws EmailException Exception when sending mail
     */
    private void sendMailConfirmation(Benutzer user) throws EmailException {
        String subject = Messages.get("mail.welcome.subject");
        String message = Messages.get("mail.welcome.message");

        /* TODO methode für confirmation mail erstellen
        Mail.Envelop envelop = new Mail.Envelop(subject, message, user.email);
        Mail mailer = new Mail(mailerClient);
        mailer.sendMail(envelop);*/
    }
}

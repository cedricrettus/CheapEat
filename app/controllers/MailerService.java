package controllers;

import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import java.net.URL;

import org.apache.commons.mail.EmailAttachment;

public class MailerService {
    @Inject MailerClient mailerClient;

    /*
     * Email senden, dass den Anbieter informiert dass eine Anfrage für sein Angebot gemacht wurde
     */
    public void sendOrderNotification(String empfaenger, String sender) {
        String cid = "1211";
        Email email = new Email()
                .setSubject("Du hast eine Bestellung")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung ist Eingegangen")
                .setBodyHtml("<html><body><p>Du hast eine Bestellung von <b>"+ sender +"</b></p></body></html>");
        mailerClient.send(email);
    }

    public void sendRegistrationInfo(URL url, String empfaenger) {
        String cid = "1212";
        Email email = new Email()
                .setSubject("Du hast dich registriert")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat registrierung bestätigen")
                .setBodyHtml("<html><body><p>Du hast dich erfolgreich registriert <br/>Hier klicken um zu bestätigen "+ url.toString() +"</b></p></body></html>");
        mailerClient.send(email);
    }

    public void sendValidationConfirmation(String empfaenger) {
        String cid = "1212";
        Email email = new Email()
                .setSubject("Du hast dich erfolgreich validiert")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Registrierung vollständig")
                .setBodyHtml("<html><body><p>Du hast dich erfolgreich Registriert, nun kannst du dich anmelden mit deinem Konto</p></body></html>");
        mailerClient.send(email);
    }

    public void sendOrderDeny(String empfaenger) {
        String cid = "1212";
        Email email = new Email()
                .setSubject("Deine Bestellung wurde abgelehnt")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung wurde abgelehnt")
                .setBodyHtml("<html><body><p>Deine Bestellung wurde abgelehnt</b></p></body></html>");
        mailerClient.send(email);
    }

    public void sendOrderAccept(String absenderName, String absenderStrasse, String empfaenger) {
        String cid = "1214";
        Email email = new Email()
                .setSubject("CheapEat Bestellung wurde akzeptiert")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung wurde akzeptiert")
                .setBodyHtml("<html><body><p>Deine Bestellung wurde von Benutzer "+absenderName+" angenommen. Sie ist bereit zur Abholung zur gegebene Zeit. Strasse zum abholen ist: "+absenderStrasse+"</b></p></body></html>");
        mailerClient.send(email);
    }
}
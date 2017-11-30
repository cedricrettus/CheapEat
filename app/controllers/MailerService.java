package controllers;

import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import java.net.URL;

import org.apache.commons.mail.EmailAttachment;

public class MailerService {
    @Inject MailerClient mailerClient;

    public void sendOrderNotification(String empfaenger, String sender) {
        String cid = "1234";
        Email email = new Email()
                .setSubject("Sie haben eine Bestellung")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung ist Eingegangen")
                .setBodyHtml("<html><body><p>Sie haben eine Bestellung von <b>"+ sender +"</b></p></body></html>");
        mailerClient.send(email);
    }

    public void sendRegistrationInfo(URL url, String empfaenger) {
        String cid = "1234";
        Email email = new Email()
                .setSubject("Sie haben sich Registriert")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung ist Eingegangen")
                .setBodyHtml("<html><body><p>Sie haben sich registriert <br/>Hier klicken um zu bestätigen "+ url.toString() +"</b></p></body></html>");
        mailerClient.send(email);
    }

    public void sendOrderDeny(String absenderName, String empfaenger) {
        String cid = "1234";
        Email email = new Email()
                .setSubject("Sie haben sich Registriert")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung wurde abgelehnt")
                .setBodyHtml("<html><body><p>Ihre Bestellung wurde von Benutzer "+absenderName+" abgelehnt</b></p></body></html>");
        mailerClient.send(email);
    }

    public void sendOrderAccept(String absenderName, String absenderStrasse, String empfaenger) {
        String cid = "1234";
        Email email = new Email()
                .setSubject("Sie haben sich Registriert")
                .setFrom("CheapEat <noreply.cheapeat@gmail.com>")
                .addTo("<" + empfaenger + ">")

                .setBodyText("CheapEat Bestellung wurde akzeptiert")
                .setBodyHtml("<html><body><p>Ihre Bestellung wurde von Benutzer "+absenderName+" angenommen. Sie ist bereit zur Abholung zur gegebene Zeit. Strasse zum abholen ist: "+absenderStrasse+"</b></p></body></html>");
        mailerClient.send(email);
    }
}
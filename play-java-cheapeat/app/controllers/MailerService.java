package controllers;

import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;

public class MailerService {
    @Inject MailerClient mailerClient;

    public void sendEmail(String empfaenger, String sender) {
        String cid = "1234";
        Email email = new Email()
                .setSubject("Sie haben eine Bestellung")
                .setFrom("CheapEat <sepp.notter65@gmail.com>")
                .addTo("Miss TO <" + empfaenger + ">")

                .setBodyText("Bestellung ist Eingegangen von " + sender)
                .setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
        mailerClient.send(email);
    }
}
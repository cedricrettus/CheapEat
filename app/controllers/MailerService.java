package controllers;

import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
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
}
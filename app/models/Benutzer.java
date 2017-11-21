package models;

import play.db.jpa.JPA;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "benutzer")
public class Benutzer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public String name;

    public String benutzername;

    public String confirmationToken;

    public String pwhash;

    public String email;

    public int bewertung;

    public Boolean validiert = false;

    public static Benutzer findByEmail(String email) {
        List<Benutzer> benutzer = JPA.em().createQuery("select u from Benutzer u where u.email = "+ email).getResultList();
        return benutzer.get(0);
    }

    public void save(){
        JPA.em().persist(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public String getPwhash() {
        return pwhash;
    }

    public void setPwhash(String pwhash) {
        this.pwhash = pwhash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    public Boolean getValidiert() {
        return validiert;
    }

    public void setValidiert(Boolean validiert) {
        this.validiert = validiert;
    }

    @Override
    public String toString() {
        return "Benutzer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", benutzername='" + benutzername + '\'' +
                ", email='" + email + '\'' +
                ", bewertung=" + bewertung +
                '}';
    }
}
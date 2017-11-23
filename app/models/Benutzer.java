package models;

import models.utils.AppException;
import models.utils.Hash;
import org.hibernate.Criteria;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

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

    public int validiert = 0;

    @Transactional
    public static Benutzer findByEmail(String email) {
        List<Benutzer> benutzer = JPA.em().createQuery("select u from Benutzer u where u.email = '"+ email+"'").getResultList();
        if(benutzer.size() > 0){
           return benutzer.get(0);
        }else{
            return null;
        }
    }

    @Transactional
    public static Benutzer findByConfirmationToken(String token){
        //TODO testen  mit getSingleResult
        List<Benutzer> benutzer = JPA.em().createQuery("select u from Benutzer u where u.confirmationToken = '"+ token+"'").getResultList();
        if(benutzer.size() > 0){
            return benutzer.get(0);
        }else{
            return null;
        }
    }

    @Transactional
    public static List<Angebot> findOffersByUser(String email){
        Benutzer benutzer = findByEmail(email);

        List<Angebot> angebote = JPA.em().createQuery("select p from Angebot p where p.benutzer_id = "+ benutzer.getId()).getResultList();
        if(angebote.size() > 0){
            return angebote;
        }else{
            return null;
        }
    }

    @Transactional
    public static List<Bestellung> findOrdersByUser(String email){
        Benutzer benutzer = findByEmail(email);

        List<Bestellung> bestellungen = JPA.em().createQuery("select b from Bestellung b where b.benutzer_id = "+ benutzer.getId()).getResultList();
        if(bestellungen.size() > 0){
            return bestellungen;
        }else{
            return null;
        }
    }

    public void save(){
        JPA.em().persist(this);
    }

    public boolean confirm(){
        this.validiert = 1;
        JPA.em().persist(this);
        return true;
    }

    @Transactional
    public static boolean confirm(Benutzer benutzer) throws AppException {
        if (benutzer == null) {
            return false;
        }

        benutzer.confirmationToken = null;
        benutzer.validiert = 1;
        benutzer.save();
        return true;
    }


    @Transactional
    public static Benutzer authenticate(String email, String clearPasswort) throws AppException {
        List<Benutzer> benutzer = JPA.em().createQuery("select u from Benutzer u where u.email = '"+ email+"'").getResultList();
        if(benutzer.size() > 0){
            // get the user with email only to keep the salt password
            if (benutzer.get(0) != null) {
                // get the hash password from the salt + clear password
                if (Hash.checkPassword(clearPasswort, benutzer.get(0).pwhash)) {
                    return benutzer.get(0);
                }
            }
        }else{
            return null;
        }
        return null;
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

    public int getValidiert() {
        return validiert;
    }

    public void setValidiert(int validiert) {
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
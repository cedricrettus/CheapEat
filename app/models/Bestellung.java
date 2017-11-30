package models;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bestellungen")
public class Bestellung {

    //TODO datum der bestellung eintragen

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public int benutzer_id;

    public int angebot_id;

    public int menge;

    public int prozesscode;
    //Prozesscode werden verwendet um den Status der Bestellung zu zeigem.
    // 1: Bestellung aufgegeben, 2: Bestellung angenommen, 3: bestellung beendet -> bewertung, 10: bestellung abgelehnt

    public Bestellung() {
    }

    public Bestellung(int benutzer_id, int angebot_id, String email, int menge, int prozesscode) {
        this.benutzer_id = benutzer_id;
        this.angebot_id = angebot_id;
        this.menge = menge;
        this.prozesscode = prozesscode;
    }

    @Transactional
    public static Bestellung findById(int id){
        return JPA.em().find(Bestellung.class, id);
    }


    @Transactional
    public void save(){
        JPA.em().persist(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBenutzer_id() {
        return benutzer_id;
    }

    public void setBenutzer_id(int benutzer_id) {
        this.benutzer_id = benutzer_id;
    }

    public int getAngebot_id() {
        return angebot_id;
    }

    public void setAngebot_id(int angebot_id) {
        this.angebot_id = angebot_id;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getProzesscode() {
        return prozesscode;
    }

    public void setProzesscode(int prozesscode) {
        this.prozesscode = prozesscode;
    }


    @Override
    public String toString() {
        return "Bestellung{" +
                "id=" + id +
                ", benutzer_id=" + benutzer_id +
                ", angebot_id=" + angebot_id +
                ", menge=" + menge +
                ", prozesscode=" + prozesscode +
                '}';
    }
}

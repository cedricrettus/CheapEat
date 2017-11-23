package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "bestellungen")
public class Bestellung {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public int benutzer_id;

    public int angebot_id;

    public int menge;

    public int prozesscode;

    public Bestellung() {
    }

    public Bestellung(int benutzer_id, int angebot_id, String email, int menge, int prozesscode) {
        this.benutzer_id = benutzer_id;
        this.angebot_id = angebot_id;
        this.menge = menge;
        this.prozesscode = prozesscode;
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

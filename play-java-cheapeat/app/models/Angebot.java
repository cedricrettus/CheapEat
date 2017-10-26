package models;

import play.data.validation.Constraints;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "angebote")
public class Angebot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public int benutzer_id;

    public int adressen_id;

    @Constraints.Required
    public String titel;

    public String beschreibung;

    @Constraints.Email
    @Constraints.Required
    public String email;

    public int plz;

    @Temporal(TemporalType.DATE)
    public Date datum;

    public String zeit;

    @Constraints.Required
    public double preis;

    public int menge;

    public String kueche;

    public int aktiv;

    public Angebot(int benutzer_id, int adressen_id, String titel, String beschreibung, String email, int plz, Date datum, String zeit, double preis, int menge, String kueche) {
        this.benutzer_id = benutzer_id;
        this.adressen_id = adressen_id;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.email = email;
        this.plz = plz;
        this.datum = datum;
        this.zeit = zeit;
        this.preis = preis;
        this.menge = menge;
        this.kueche = kueche;
    }

    public Angebot() {
    }

    @Override
    public String toString() {
        return "Angebot{" +
                "id='" + id + '\'' +
                ", titel='" + titel + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", datum='" + datum + '\'' +
                ", zeit='" + zeit + '\'' +
                ", menge=" + menge +
                ", kueche='" + kueche + '\'' +
                '}';
    }
}


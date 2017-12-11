package models;

import play.data.validation.Constraints;
import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.File;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    @Temporal(TemporalType.DATE)
    public Date datum;

    public String zeit;

    @Constraints.Required
    public double preis;

    public int menge;

    public String kueche;

    public int aktiv;

    public int bild;


    public Angebot() {
    }


    public int getBild() {
        return bild;
    }

    public void setBild(int bild) {
        this.bild = bild;
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

    public int getAdressen_id() {
        return adressen_id;
    }

    public void setAdressen_id(int adressen_id) {
        this.adressen_id = adressen_id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getZeit() {
        return zeit;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public String getKueche() {
        return kueche;
    }

    public void setKueche(String kueche) {
        this.kueche = kueche;
    }

    public int getAktiv() {
        return aktiv;
    }

    public void setAktiv(int aktiv) {
        this.aktiv = aktiv;
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


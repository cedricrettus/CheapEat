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

    public Bestellung() {
    }

    public Bestellung(int benutzer_id, int angebot_id, String email, int menge, int prozesscode) {
        this.benutzer_id = benutzer_id;
        this.angebot_id = angebot_id;
        this.menge = menge;
        this.prozesscode = prozesscode;
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

    public class BestellungAngebot {
        private String benutzername;
        private String bewertung;
        private String strasse;
        private String plz;
        private String ort;
        private String prozesscode;
        private String titel;
        private String datum;

        private Bestellung bestellung;

        public BestellungAngebot(){

        }

        /*
        public List<BestellungAngebot> getDataFromOffer(List<Angebot> angebote){
            List<BestellungAngebot> ba = new ArrayList<BestellungAngebot>();

            Benutzer benutzer;
            for(int i = 0; i < angebote.size(); i++){
                benutzer = Benutzer.findById(angebote.get(i).getId());

            }




            return null;
        }*/

        public String getBenutzername() {
            return benutzername;
        }

        public void setBenutzername(String benutzername) {
            this.benutzername = benutzername;
        }

        public String getBewertung() {
            return bewertung;
        }

        public void setBewertung(String bewertung) {
            this.bewertung = bewertung;
        }

        public String getStrasse() {
            return strasse;
        }

        public void setStrasse(String strasse) {
            this.strasse = strasse;
        }

        public String getPlz() {
            return plz;
        }

        public void setPlz(String plz) {
            this.plz = plz;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }

        public String getProzesscode() {
            return prozesscode;
        }

        public void setProzesscode(String prozesscode) {
            this.prozesscode = prozesscode;
        }

        public String getTitel() {
            return titel;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public String getDatum() {
            return datum;
        }

        public void setDatum(String datum) {
            this.datum = datum;
        }

        public Bestellung getBestellung() {
            return bestellung;
        }

        public void setBestellung(Bestellung bestellung) {
            this.bestellung = bestellung;
        }
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

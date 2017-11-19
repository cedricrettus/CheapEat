package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import play.data.validation.Constraints;

@Entity
@Table(name = "bilder")
public class Bild {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private int angebote_id;

    private String url;

    private String beschreibung;

    public Bild() {
    }

    public Bild(String url, int angebote_id) {
        this.url = url;
        this.angebote_id = angebote_id;
    }

    public int getAngebote_id() {
        return angebote_id;
    }

    public void setAngebote_id(int angebote_id) {
        this.angebote_id = angebote_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return "Bild{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }
}
package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "bilder")
public class Bild {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String url;

    private String beschreibung;

    public Bild() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bild(String url) {
        this.url = url;
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
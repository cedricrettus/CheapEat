package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "bilder")
public class Bilder {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public String url;

    public String beschreibung;

    @Override
    public String toString() {
        return "Bilder{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }
}
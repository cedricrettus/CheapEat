package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "adressen")
public class Adressen {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public String strasse;

    public int plz;

    public String ort;

    public String hausart;

    public String stockwerk;

    @Override
    public String toString() {
        return "Adressen{" +
                "id=" + id +
                ", strasse='" + strasse + '\'' +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                ", hausart='" + hausart + '\'' +
                ", stockwerk='" + stockwerk + '\'' +
                '}';
    }
}
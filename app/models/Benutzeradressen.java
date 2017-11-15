package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "benutzeradressen")
public class Benutzeradressen {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public int benutzer_id;

    public int adressen_id;

    @Override
    public String toString() {
        return "Benutzeradressen{" +
                "id=" + id +
                ", benutzer_id=" + benutzer_id +
                ", adressen_id=" + adressen_id +
                '}';
    }
}
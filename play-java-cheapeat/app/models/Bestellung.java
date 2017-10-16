package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "bestellung")
public class Bestellung {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public int benutzer_id;

    public int angebot_id;

    public int menge;

    public int prozesscode;

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

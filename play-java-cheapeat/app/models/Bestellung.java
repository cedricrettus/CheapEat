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

    public String email;

    public int menge;

    public int prozesscode;

    public Bestellung() {
    }

    public Bestellung(int benutzer_id, int angebot_id, String email, int menge, int prozesscode) {
        this.benutzer_id = benutzer_id;
        this.angebot_id = angebot_id;
        this.email = email;
        this.menge = menge;
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

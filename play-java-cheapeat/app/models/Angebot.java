package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "angebote")
public class Angebot {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public String id;

    public String titel;

    public String beschreibung;

    @Temporal(TemporalType.DATE)
    public Date datum;

    public String zeit;

    public int menge;

    public String kueche;

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


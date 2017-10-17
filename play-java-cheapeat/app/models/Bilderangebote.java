package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "bilderangebote")
public class Bilderangebote {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public int angebote_id;

    public int bilder_id;

    @Override
    public String toString() {
        return "Bilderangebote{" +
                "id=" + id +
                ", angebote_id=" + angebote_id +
                ", bilder_id=" + bilder_id +
                '}';
    }
}
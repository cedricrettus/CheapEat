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
    private int id;

    private int angebote_id;

    private int bilder_id;

    public Bilderangebote() {
    }

    public Bilderangebote(int angebote_id, int bilder_id) {
        this.angebote_id = angebote_id;
        this.bilder_id = bilder_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAngebote_id() {
        return angebote_id;
    }

    public void setAngebote_id(int angebote_id) {
        this.angebote_id = angebote_id;
    }

    public int getBilder_id() {
        return bilder_id;
    }

    public void setBilder_id(int bilder_id) {
        this.bilder_id = bilder_id;
    }

    @Override
    public String toString() {
        return "Bilderangebote{" +
                "id=" + id +
                ", angebote_id=" + angebote_id +
                ", bilder_id=" + bilder_id +
                '}';
    }
}
package models;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "benutzer")
public class Benutzer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public String name;

    public String nachname;

    public String benutzername;

    public String email;

    public int bewertung;

    @Override
    public String toString() {
        return "Benutzer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nachname='" + nachname + '\'' +
                ", benutzername='" + benutzername + '\'' +
                ", email='" + email + '\'' +
                ", bewertung=" + bewertung +
                '}';
    }
}
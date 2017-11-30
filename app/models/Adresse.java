package models;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "adressen")
public class Adresse {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private int benutzer_id;

    private String strasse;

    private int plz;

    private String ort;

    public Adresse() {

    }

    //public String hausart;

    //public String stockwerk;

    @Transactional
    public static Adresse findByUserId(int userId){
        List<Adresse> adressen = JPA.em().createQuery("select p from Adresse p where p.benutzer_id = "+ userId).getResultList();
        if(adressen.size() > 0){
            return adressen.get(0);
        }else{
            return null;
        }
    }

    @Transactional
    public void save(){
        JPA.em().persist(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getBenutzer_id() {
        return benutzer_id;
    }

    public void setBenutzer_id(int benutzer_id) {
        this.benutzer_id = benutzer_id;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", strasse='" + strasse + '\'' +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                '}';
    }
}
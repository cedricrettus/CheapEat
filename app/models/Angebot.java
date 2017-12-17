package models;

import play.data.validation.Constraints;
import play.db.jpa.JPA;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "angebote")
public class Angebot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int benutzer_id;

    @Constraints.Required
    private String titel;

    @Constraints.Required
    private String beschreibung;

    @Constraints.Required
    @Temporal(TemporalType.DATE)
    private Date datum;

    @Temporal(TemporalType.TIME)
    private Date zeit;

    @Constraints.Required
    private String zeitForm;

    @Constraints.Required
    private double preis;

    @Constraints.Required
    private int menge;

    private int mengeVerfuegbar;

    @Constraints.Required
    private String kueche;

    private int aktiv;

    private int bild;


    public Angebot() {
    }

    @Transactional
    public static Angebot findById(int id){
        return JPA.em().find(Angebot.class, id);
    }

    @Transactional
    public static Angebot findByTitle(String titel){
        List<Angebot> angebot = JPA.em().createQuery("select a from Angebot a where a.titel = "+ titel).getResultList();
        if(angebot.size() > 0){
            return angebot.get(0);
        }else{
            return null;
        }

    }

    @Transactional
    public void save(){
        JPA.em().persist(this);
    }

    @Transactional
    public boolean deleteOffer(int id){
        Query deleteAngebot = JPA.em().createQuery("delete from Angebot a where a.id = "+ id);
        Query deleteBilder = JPA.em().createQuery("delete from Bild b where b.angebote_id = "+ id);

        if(deleteAngebot.executeUpdate() > 0 && deleteBilder.executeUpdate() >= 0){
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBenutzer_id() {
        return benutzer_id;
    }

    public void setBenutzer_id(int benutzer_id) {
        this.benutzer_id = benutzer_id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getZeit() {
        return zeit;
    }

    public void setZeit(Date zeit) {
        this.zeit = zeit;
    }

    public String getZeitForm() {
        return zeitForm;
    }

    public void setZeitForm(String zeitForm) {
        this.zeitForm = zeitForm;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getMengeVerfuegbar() {
        return mengeVerfuegbar;
    }

    public void setMengeVerfuegbar(int mengeVerfuegbar) {
        this.mengeVerfuegbar = mengeVerfuegbar;
    }

    public String getKueche() {
        return kueche;
    }

    public void setKueche(String kueche) {
        this.kueche = kueche;
    }

    public int getAktiv() {
        return aktiv;
    }

    public void setAktiv(int aktiv) {
        this.aktiv = aktiv;
    }

    public int getBild() {
        return bild;
    }

    public void setBild(int bild) {
        this.bild = bild;
    }

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


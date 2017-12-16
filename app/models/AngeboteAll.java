package models;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

/**
 * Created by Fabio on 17.11.2017.
 */
public class AngeboteAll {
    private int plz;
    /*
     * Bildet von einem Angobot das Komplette Angebot inkl Bilder URLs und Adresse
     */

    private List urls;

    private Angebot angebot;

    private String benutzername;
    private double bewertung;
    private int anzBewertung;

    public AngeboteAll(){

    }


    public AngeboteAll(int plz, List urls, String benutzername, double bewertung, int anzBewertung, Angebot angebot) {
        this.plz = plz;
        this.urls = urls;
        this.angebot = angebot;
        this.benutzername = benutzername;
        this.bewertung = bewertung;
        this.anzBewertung = anzBewertung;
    }

    public AngeboteAll(List urls) {

    }

    public Angebot getAngebot() {
        return angebot;
    }

    public void setAngebot(Angebot angebot) {
        this.angebot = angebot;
    }

    public List getUrls() {
        return urls;
    }

    public void setUrls(List urls) {
        this.urls = urls;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public double getBewertung() {
        return bewertung;
    }

    public void setBewertung(double bewertung) {
        this.bewertung = bewertung;
    }

    public int getAnzBewertung() {
        return anzBewertung;
    }

    public void setAnzBewertung(int anzBewertung) {
        this.anzBewertung = anzBewertung;
    }

    /*
         * Komplettes Angebot wird gebildet, inkls aller Bilder URLs, sofern Bilder hochgeladen wurden. Zusätzlich benutzername, bewertungen und plz
         */
    @Transactional
    public static List<AngeboteAll> buildCompleteOfferFromId(List<Angebot> angebote){
        List<AngeboteAll> angeboteAll = new ArrayList<AngeboteAll>();
        List urls = new ArrayList<String>();


        for (int i = 0; i < angebote.size(); i++) {
            Adresse adresse = Adresse.findByUserId(angebote.get(i).getBenutzer_id());
            Benutzer benutzer = Benutzer.findById(angebote.get(i).getBenutzer_id());

            if (angebote.get(i).getBild() == 1) {
                urls = JPA.em().createQuery("select b.url from Bild b where b.angebote_id =" + angebote.get(i).getId()).getResultList();
                angeboteAll.add(new AngeboteAll(adresse.getPlz(), urls, benutzer.getBenutzername(), benutzer.getBewertung(), benutzer.getAnzBewertung(), angebote.get(i)));
            } else {
                angeboteAll.add(new AngeboteAll(adresse.getPlz(), null, benutzer.getBenutzername() , benutzer.getBewertung(), benutzer.getAnzBewertung(), angebote.get(i)));
            }
            
            angeboteAll.get(i).setBewertung(Benutzer.roundRating(angeboteAll.get(i).getBewertung()));

        }

        return angeboteAll;
    }

}

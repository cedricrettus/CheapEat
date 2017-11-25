package models;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fabio on 17.11.2017.
 */
public class AngebotUrls {
    private List urls;

    private Angebot angebot;

    public AngebotUrls(){

    }

    public AngebotUrls(List urls, Angebot angebote) {
        this.urls = urls;
        this.angebot = angebote;
    }

    public AngebotUrls(List urls) {

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

    @Transactional
    public static List<AngebotUrls> buildUrlsFromOffers(List<Angebot> angebote){
        List<AngebotUrls> angebotUrls = new ArrayList<AngebotUrls>();
        List urls = new ArrayList<String>();

        for (int i = 0; i < angebote.size(); i++) {
            if (angebote.get(i).getBild() == 1) {
                urls = JPA.em().createQuery("select b.url from Bild b where b.angebote_id =" + angebote.get(i).getId()).getResultList();
                angebotUrls.add(new AngebotUrls(urls, angebote.get(i)));
            } else {
                angebotUrls.add(new AngebotUrls(null, angebote.get(i)));
            }

        }

        return angebotUrls;
    }

}

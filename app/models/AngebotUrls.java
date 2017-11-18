package models;

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
}

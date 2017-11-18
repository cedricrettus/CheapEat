package models;

import java.util.List;

/**
 * Created by Fabio on 17.11.2017.
 */
public class AngebotBilder {
    private List urls;

    private Angebot angebot;

    public AngebotBilder(){

    }

    public AngebotBilder(List urls, Angebot angebote) {
        this.urls = urls;
        this.angebot = angebote;
    }

    public AngebotBilder(List urls) {

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

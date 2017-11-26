package models;

import java.util.Date;

public class Joins {

    public static class BestellungAlle {
        private int menge;
        private int plz;
        private String strasse;
        private String ort;
        private String benutzername;
        private String titel;
        private int prozesscode;
        private Date datum;
        private int bestellungsId;

        public BestellungAlle() {

        }

        public int getMenge() {
            return menge;
        }

        public void setMenge(int menge) {
            this.menge = menge;
        }

        public int getPlz() {
            return plz;
        }

        public void setPlz(int plz) {
            this.plz = plz;
        }

        public String getStrasse() {
            return strasse;
        }

        public void setStrasse(String strasse) {
            this.strasse = strasse;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }

        public String getBenutzername() {
            return benutzername;
        }

        public void setBenutzername(String benutzername) {
            this.benutzername = benutzername;
        }

        public String getTitel() {
            return titel;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public int getProzesscode() {
            return prozesscode;
        }

        public void setProzesscode(int prozesscode) {
            this.prozesscode = prozesscode;
        }

        public Date getDatum() {
            return datum;
        }

        public void setDatum(Date datum) {
            this.datum = datum;
        }

        public int getBestellungsId() {
            return bestellungsId;
        }

        public void setBestellungsId(int bestellungsId) {
            this.bestellungsId = bestellungsId;
        }
    }

    public static class AnfragenAlle{
        private int bestellungsId;
        private int menge;
        private int plz;
        private String strasse;
        private String ort;
        private String benutzername;
        private String name;
        private String titel;
        private int prozesscode;
        private Date datum;

        public AnfragenAlle(){

        }

        public int getBestellungsId() {
            return bestellungsId;
        }

        public void setBestellungsId(int bestellungsId) {
            this.bestellungsId = bestellungsId;
        }

        public int getMenge() {
            return menge;
        }

        public void setMenge(int menge) {
            this.menge = menge;
        }

        public int getPlz() {
            return plz;
        }

        public void setPlz(int plz) {
            this.plz = plz;
        }

        public String getStrasse() {
            return strasse;
        }

        public void setStrasse(String strasse) {
            this.strasse = strasse;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }

        public String getBenutzername() {
            return benutzername;
        }

        public void setBenutzername(String benutzername) {
            this.benutzername = benutzername;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitel() {
            return titel;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public int getProzesscode() {
            return prozesscode;
        }

        public void setProzesscode(int prozesscode) {
            this.prozesscode = prozesscode;
        }

        public Date getDatum() {
            return datum;
        }

        public void setDatum(Date datum) {
            this.datum = datum;
        }
    }

}

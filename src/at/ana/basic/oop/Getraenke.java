package at.ana.basic.oop;

public class Getraenke {
    private int iAnzahl;

    private Flasche flasche;

    public Getraenke(int iAnzahl, Flasche flasche) {
        this.iAnzahl = iAnzahl;
        this.flasche = flasche;
    }

    public int getiAnzahl() {
        return iAnzahl;
    }

    public void setiAnzahl(int iAnzahl) {
        this.iAnzahl = iAnzahl;
    }

    public Flasche getFlasche() {
        return flasche;
    }

    public void setFlasche(Flasche flasche) {
        this.flasche = flasche;
    }
}

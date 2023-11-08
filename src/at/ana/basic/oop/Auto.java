package at.ana.basic.oop;

import java.util.ArrayList;

public class Auto {
    public int iLeistung = 0;
    private String sFarbe = "keine Farbe";

    private Fahhrad kofferaumfahrrad;

    private ArrayList<Getraenke> kofferraumGetraenkekiste= new ArrayList<Getraenke>() ;

    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public Auto(Fahhrad kofferaumfahrrad) {
        this.kofferaumfahrrad = kofferaumfahrrad;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public Fahhrad getKofferaumfahrrad() {
        return kofferaumfahrrad;
    }

    public void setKofferaumfahrrad(Fahhrad kofferaumfahrrad) {
        this.kofferaumfahrrad = kofferaumfahrrad;
    }

    public ArrayList<Getraenke> getKofferraumGetraenkekiste() {
        return kofferraumGetraenkekiste;
    }

    public void setKofferraumGetraenkekiste(Getraenke kofferraumGetraenkekiste) {
        this.kofferraumGetraenkekiste.add(kofferraumGetraenkekiste);
    }
}

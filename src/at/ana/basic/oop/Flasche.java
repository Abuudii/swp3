package at.ana.basic.oop;

public class Flasche {

    private String sHersteller;
    private int iVolumen;
    private String sGefuelltmit;

    public Flasche(String iHersteller, int iVolumen, String sGefuelltmit) {
        this.sHersteller = iHersteller;
        this.iVolumen = iVolumen;
        this.sGefuelltmit = sGefuelltmit;
    }

    public String getiHersteller() {
        return sHersteller;
    }

    public void setiHersteller(String iHersteller) {
        this.sHersteller = iHersteller;
    }

    public int getiVolumen() {
        return iVolumen;
    }

    public void setiVolumen(int iVolumen) {
        this.iVolumen = iVolumen;
    }

    public String getsGefuelltmit() {
        return sGefuelltmit;
    }

    public void setsGefuelltmit(String sGefuelltmit) {
        this.sGefuelltmit = sGefuelltmit;
    }
}

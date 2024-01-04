package at.ana.basic.Rechna;

import java.util.Dictionary;

public class Rechner {

    public void Summe(double Zahl1, double Zahl2){
        double Summe=0;
        Summe = Zahl1 + Zahl2;
        System.out.println("Summe: " + Summe);
    }

    public void Differenz(double Zahl1, double Zahl2){
        double Differenz=0;
        Differenz = Zahl1 - Zahl2;
        System.out.println("Differenz: " + Differenz);
    }

    public void Produkt(double Zahl1, double Zahl2){
        double Produkt=0;
        Produkt = Zahl1 * Zahl2;
        System.out.println("Produkt: " + Produkt);
    }

    public void Quotient(double Zahl1, double Zahl2){
        double Quotient=0;
        Quotient = Zahl1 / Zahl2;
        System.out.println("Quotient: " + Quotient);
    }

}

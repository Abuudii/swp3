package at.ana.basic.Rechna;

import static java.lang.Math.*;
import static java.lang.Math.toRadians;

public class Wissenschaft extends Rechner{
    public void Sinus(double Zahl){
        double Ergebnis = sin(toRadians(Zahl));
        System.out.println("Ergebnis: " +Ergebnis);
    }

    public void Cosinus(double Zahl){
        double Ergebnis=cos(toRadians(Zahl));
        System.out.println("Ergebnis: "+Ergebnis);
    }
}

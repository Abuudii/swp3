package at.ana.basic.Geo_Figuren;

public class Rechteck extends Figuren{
    public Rechteck(String name) {
        super(name);
    }

    public void Fleache(double Laenge, double Breite){
        double Flaecheninhalt = 0;
        Flaecheninhalt = Laenge * Breite;
        System.out.println("Flaecheninhalt: " + Flaecheninhalt);
    }
}

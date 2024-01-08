package at.ana.basic.Geo_Figuren;

public class Wuerfel extends Figuren{
    public Wuerfel(String name) {
        super(name);
    }

    public void Fleache(double Laenge){
        double Flaecheninhalt = 0;
        Flaecheninhalt = Laenge * Laenge * Laenge;
        System.out.println("Flaecheninhalt: " + Flaecheninhalt);
    }
}

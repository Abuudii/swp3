package at.ana.basic.Geo_Figuren;

public class Kreis extends Figuren{
    public Kreis(String name) {
        super(name);
    }

    public void Flaeche(double Radius){
        double Flaecheninhalt = 2 * Radius * Math.PI;
        System.out.println("Flaeche: " + Flaecheninhalt);
    }
}

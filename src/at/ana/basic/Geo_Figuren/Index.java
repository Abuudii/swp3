package at.ana.basic.Geo_Figuren;

public class Index {
    public static void main(String[] args) {

        Kreis K1=new Kreis("Kreis1");
        K1.Flaeche(3);

        Rechteck R1 = new Rechteck("Rechteck1");
        R1.Fleache(3,2);

        Wuerfel W1 = new Wuerfel("Wuerfel1");
        W1.Fleache(5);

        Quadrat Q1 = new Quadrat("Quadrat1");
        Q1.Fleache(2);

        W1.Name();
        Q1.Name();
        R1.Name();
        K1.Name();
    }
}

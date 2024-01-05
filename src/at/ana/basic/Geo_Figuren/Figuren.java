package at.ana.basic.Geo_Figuren;

import javax.naming.Name;

public class Figuren {
    private String name;

    public Figuren(String name) {
        this.name = name;
    }

    public void Name(){
        System.out.println("Figur heißt: " + getName());
    }

    public void Flaeche(){
        double Flaeche=0;
        System.out.println("Flächeninhalt: " + Flaeche);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

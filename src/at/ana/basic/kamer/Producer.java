package at.ana.basic.kamer;

public class Producer {
    private String name;
    private int Alter;
    private String Herkunft;


    public Producer(String name, int alter, String herkunft) {
        this.name = name;
        Alter = alter;
        Herkunft = herkunft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }

    public String getHerkunft() {
        return Herkunft;
    }

    public void setHerkunft(String herkunft) {
        Herkunft = herkunft;
    }
}

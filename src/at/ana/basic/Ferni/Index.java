package at.ana.basic.Ferni;

public class Index {
    public static void main(String[] args) {
        Batterie B1 = new Batterie(30);
        Batterie B2 = new Batterie(20);

        Fernbedienung F1 = new Fernbedienung(true, 40);
        F1.addLight(B1);
        F1.addLight(B2);

        F1.getStatus();
        F1.turnOff();
        F1.getStatus();
    }
}

package at.ana.basic.Fernbedienung;

public class Index {
    public static void main(String[] args) {

        Batterie B1= new Batterie(90);
        Batterie B2= new Batterie(80);

        Fernbedienung F1 = new Fernbedienung();
        F1.addLightElement(B1);
        F1.addLightElement(B2);

        F1.getStatus();
        F1.turnOff();
        F1.getStatus();
        F1.turnOn();
        F1.getStatus();

    }
}

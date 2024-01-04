package at.ana.basic.lampe;

public class Index {
    public static void main(String[] args) {
        Gluehelemente G1 = new Gluehelemente("LED1", "Grün", 5, true);
        Gluehelemente G2 = new Gluehelemente("LED2", "Blau", 2, true);
        Gluehelemente G3 = new Gluehelemente("LED3", "Lila", 1, false);
        Gluehelemente G4 = new Gluehelemente("LED4", "Rot", 0, false);

        lampe l1 = new lampe();
        l1.addLightElement(G1);
        l1.addLightElement(G2);
        l1.addLightElement(G3);
        l1.addLightElement(G4);

       l1.getOverallUsage();
       l1.turnAllOn();
       l1.getOverallUsage();
       l1.printNamesOfLightElements();
    }
}

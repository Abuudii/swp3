package at.ana.basic.kamer;

public class index {
    public static void main(String[] args) {
        SdCard sd1 = new SdCard(23, new Lens(18, 28));
        Producer p1 = new Producer("Sero", 40, "Austria");
        Lens lens = new Lens(2000, 34);
        Producer producer = new Producer("Mero", 22, "Turkai");

        Camera camera = new Camera(10, 20,"red");

        lens.getGroeße();


    }
}
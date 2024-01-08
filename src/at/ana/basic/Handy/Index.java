package at.ana.basic.Handy;

public class Index {
    public static void main(String[] args) {

        PhoneFile P1= new PhoneFile("Png", 34, "Hallo");
        PhoneFile P2= new PhoneFile("Pn", 50, "lallo");

        Camera C1 = new Camera(12);



        SDCard SD1 = new SDCard(290);

        SD1.saveFile(P1);
        SD1.saveFile(P2);

        SD1.getAllFiles();;

        SD1.getFreeSpace();

        C1.makePicture("ha");

    }
}

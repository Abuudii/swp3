package at.ana.basic.oop;

public class TestIT {
    public static void main(String[] args) {
        Auto auto = new Auto(300,"rot");
        Auto auto1 = new Auto();
        auto.setiLeistung(300);
        auto.setsFarbe("rot");
        //auto.iLeistung=400;
        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());

        Fahhrad fahhrad=new Fahhrad();
        System.out.println(fahhrad.getsMarke());
        System.out.println(fahhrad.getsFarbe());

        Flasche flasche = new Flasche("Cola", 1, "Cola Zero");
        Getraenke getraenke = new Getraenke(24, flasche);
        auto.setKofferraumGetraenkekiste(getraenke);

        Flasche flasche1 = new Flasche("voüs", 330, "cola");

    }
}

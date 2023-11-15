package at.ana.basic.KonstrukturundKapeselung;

import at.ana.basic.oop.car;

public class index {
    public static void main(String[] args) {

        car c1 = new car();
        c1.fuelConsumption = 7;
        c1.brand = "BMW";
        c1.serialnumber = "B77";
        c1.color="MattBlack";
        c1.fuelamount= 50;
        c1.MaxFuel= 120;
        c1.amountOfRepetitions=5;
        c1.fuelcomsumptionperkilometer=0.3;

        car c2 = new car();
        c2.fuelConsumption=5;
        c2.brand="Dodge";
        c2.serialnumber="D11";
        c2.color="DeepPurple";
        c2.fuelamount=60;
        c2.MaxFuel= 140;
        c2.amountOfRepetitions=2;
        c2.fuelcomsumptionperkilometer=0.4;


        System.out.println(c1.brand);
        System.out.println(c1.fuelamount);
        c1.drive();
        System.out.println(c1.fuelamount);
        c1.bremsen();
        System.out.println(c1.turboBoost);
        c1.turboBoost();
        System.out.println(c1.honk);
        c1.honk();
        System.out.println(c1.getRemainingRange);
        c1.getRemainingRange();

        System.out.println('\n');

        System.out.println(c2.brand);
        System.out.println(c2.fuelamount);
        c2.drive();
        System.out.println(c2.fuelamount);
        c2.bremsen();
        System.out.println(c2.turboBoost);
        c2.turboBoost();
        System.out.println(c2.honk);
        c2.honk();
        System.out.println(c2.getRemainingRange);
        c2.getRemainingRange();

    }
}

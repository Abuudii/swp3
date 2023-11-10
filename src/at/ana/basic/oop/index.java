package at.ana.basic.oop;

import at.ana.basic.oop.car;

public class index {
    public static void main(String[] args) {

        car c1 = new car();
        c1.fuelConsumption = 7;
        c1.brand = "BMW";
        c1.serialnumber = "B77";
        c1.color="MattBlack";

        car c2 = new car();
        c2.fuelConsumption=5;
        c2.brand="Dodge";
        c2.serialnumber="D11";
        c2.color="DeepPurple";

        System.out.println(c1.brand);
        System.out.println(c2.brand);


    }
}

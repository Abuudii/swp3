package at.ana.basic.KonstrukturundKapeselung;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type; //Diesel oder Benzin
    public int speed;


    public Engine(int horsepower, TYPE type, int speed) {
        this.horsepower = horsepower;
        this.type = type;
        this.speed=speed;
    }


    //amount should be between 0 and 100
    public void drive(int amount){
        System.out.println("the motor is running " + amount);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

}

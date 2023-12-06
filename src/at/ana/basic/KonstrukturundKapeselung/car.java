package at.ana.basic.KonstrukturundKapeselung;

public class car {


    private int fuelConsumption;
    private String brand;
    private String serialnumber;
    private String color;
    private double fuelamount;
    private int MaxFuel;
    private String bremsen;
    private String turboBoost;
    private String honk;
    private int amountOfRepetitions;
    private double getRemainingRange;
    private double fuelcomsumptionperkilometer;
    private Engine engine;
    public int speedzone;

    public car(Engine engine, String brand, String color){
        this.engine=engine;
        this.brand=brand;
        this.color=color;

    }

    public void drive(){
        this.fuelamount = this.fuelamount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    public void speed(){
        if(speedzone>75){
            System.out.println("Vollgas");
        }else if(speedzone>25 && speedzone<75 ){
            System.out.println("Normal");
        }else{
            System.out.println("Langsam");
        }

    }

    public void bremsen(){
        System.out.println("Ich Bremse");
    }

    public void turboBoost(){
        if(fuelamount >= 0.1 * MaxFuel){
            System.out.println("SuperBoost");
        }
        else{
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(){
        for (int i = 0; i <amountOfRepetitions ; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        this.getRemainingRange = this.fuelamount / this.fuelcomsumptionperkilometer;
        System.out.println("Die Maximaldistanz betraegt:" + getRemainingRange);
    }


    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelamount(double fuelamount) {
        this.fuelamount = fuelamount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getColor() {
        return color;
    }

    public double getFuelamount() {
        return fuelamount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

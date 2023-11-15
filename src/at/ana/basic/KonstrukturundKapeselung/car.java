package at.ana.basic.KonstrukturundKapeselung;

public class car {

    public int fuelConsumption;
    public String brand;
    public String serialnumber;
    public String color;
    public double fuelamount;
    public int MaxFuel;
    public String bremsen;
    public String turboBoost;
    public String honk;
    public int amountOfRepetitions;
    public double getRemainingRange;

    public double fuelcomsumptionperkilometer;


    public void drive(){
        this.fuelamount = this.fuelamount - this.fuelConsumption;
        System.out.println("I am driving");
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



}


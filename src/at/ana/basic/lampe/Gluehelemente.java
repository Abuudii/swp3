package at.ana.basic.lampe;

public class Gluehelemente {
    private String Name;
    private String Farbe;
    private int Power;
    private boolean Status;

    public Gluehelemente(String Name, String Farbe, int Power, boolean Status){
        this.Name = Name;
        this.Farbe=Farbe;
        this.Power=Power;
        this.Status=Status;
    }

    public void turnON(){
        if(Status==true){
            System.out.println("Mein Name ist"+ getName()+". Ich bin bereits eingeschalten");
        }else {
            int Neu = getPower()+5;
            setPower(Neu);
        }
    }

    public String getName() {
        return Name;
    }

    public String getFarbe() {
        return Farbe;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}

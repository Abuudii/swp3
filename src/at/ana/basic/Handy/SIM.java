package at.ana.basic.Handy;

public class SIM {
    private int ID;
    private String number;

    public void doCall(String numba){
        System.out.println("Die Nummer: " + number + "ruft " + numba + " an");
    }

    public SIM(int ID, String number) {
        this.ID = ID;
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

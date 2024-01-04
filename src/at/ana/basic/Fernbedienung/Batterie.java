package at.ana.basic.Fernbedienung;

public class Batterie {

    private int chargungStatus;

    public Batterie(int chargungStatus) {
        this.chargungStatus = chargungStatus;
    }

    public int getChargungStatus() {
        return chargungStatus;
    }

    public void setChargungStatus(int chargungStatus) {
        this.chargungStatus = chargungStatus;
    }
}

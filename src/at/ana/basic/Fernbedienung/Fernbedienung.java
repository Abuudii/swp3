package at.ana.basic.Fernbedienung;

import at.ana.basic.lampe.Gluehelemente;

import java.util.ArrayList;
import java.util.List;

public class Fernbedienung {
        private List<Batterie> Batterie;

        public Fernbedienung(){
            this.Batterie = new ArrayList<>();
        }
        private boolean isOn;
        private int hasPower;

    public Fernbedienung(boolean isOn, int hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
    }

    public void addLightElement(Batterie Batterie){
        this.Batterie.add(Batterie);
    }

    public void turnOn(){
            isOn=true;
            for (int i=0; i<Batterie.size();i++){
                int nAkku=Batterie.get(i).getChargungStatus()-5;
                Batterie.get(i).setChargungStatus(nAkku);
            }
            System.out.println("Verbraucher angeschlossen");
        }

        public void getStatus(){
            int summe=0;
            for (int i=0;i<Batterie.size(); i++){
               summe += Batterie.get(i).getChargungStatus();
            }
            setHasPower(summe/Batterie.size());
            System.out.println("Mittewert der Batterien: " + hasPower);
        }
        public void turnOff(){
            isOn=false;
            System.out.println("Kein Verbraucher angeschlossen");
        }

    public List<at.ana.basic.Fernbedienung.Batterie> getBatterie() {
        return Batterie;
    }

    public void setBatterie(List<at.ana.basic.Fernbedienung.Batterie> batterie) {
        Batterie = batterie;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getHasPower() {
        return hasPower;
    }

    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }
}

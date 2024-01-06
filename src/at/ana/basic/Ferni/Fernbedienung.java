package at.ana.basic.Ferni;

import java.util.ArrayList;
import java.util.List;

public class Fernbedienung {
    private boolean isOn;
    private List<Batterie> batterien;

    public Fernbedienung() {
        this.batterien = new ArrayList<>();
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Keins angschlossen");
    }

    public void getStatus() {
            int summe = 0;
            for (int i = 0; i < batterien.size(); i++) {
                summe += batterien.get(i).getChargingStatus();
            }
            int mittelwert = summe / batterien.size();
            System.out.println("Mittelwert: " + mittelwert);
    }

    public void turnOn() {
        isOn = true;
        for (int i = 0; i < batterien.size(); i++) {
            int Neu = batterien.get(i).getChargingStatus() - 5;
            batterien.get(i).setChargingStatus(Neu);
            System.out.println("Angeschlossen");
        }
    }

    public void addLight(Batterie bat) {
        this.batterien.add(bat);
    }

    public Fernbedienung(boolean isOn, int hasPower) {
        this.isOn = isOn;
        this.batterien = new ArrayList<>();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
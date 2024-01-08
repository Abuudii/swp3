package at.ana.basic.Rueckspiegel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reifen {
    private String ReifenDurchmesser;
    private int Baujahr;
    private short Geschwindigkeitsindex;

    public List<Reifen> Reader;

    public void Reifen(){
        this.Reader=new ArrayList<>();
    }

    public void addRad(Reifen Reifen){
        this.Reader.add(Reifen);
    }




    public Reifen(String reifenDurchmesser, int baujahr, short geschwindigkeitsindex) {
        ReifenDurchmesser = reifenDurchmesser;
        Baujahr = baujahr;
        Geschwindigkeitsindex = geschwindigkeitsindex;
    }

    public String getReifenDurchmesser() {
        return ReifenDurchmesser;
    }

    public void setReifenDurchmesser(String reifenDurchmesser) {
        ReifenDurchmesser = reifenDurchmesser;
    }

    public int getBaujahr() {
        return Baujahr;
    }

    public void setBaujahr(int baujahr) {
        Baujahr = baujahr;
    }

    public short getGeschwindigkeitsindex() {
        return Geschwindigkeitsindex;
    }

    public void setGeschwindigkeitsindex(short geschwindigkeitsindex) {
        Geschwindigkeitsindex = geschwindigkeitsindex;
    }
}

package at.ana.basic.lampe;

import java.util.ArrayList;
import java.util.List;

public class lampe {
    private List<Gluehelemente> Gluehelemente;

    public lampe() {
        this.Gluehelemente=new ArrayList<>();
    }

    public void addLightElement(Gluehelemente Gluehelemente){
        this.Gluehelemente.add(Gluehelemente);
    }

    public void turnAllOn(){
        for (int i = 0; i<Gluehelemente.size();i++){
            if(!Gluehelemente.get(i).isStatus()) {
                Gluehelemente.get(i).setStatus(true);
                int Neu = Gluehelemente.get(i).getPower() + 5;
                Gluehelemente.get(i).setPower(Neu);
            }
        }
    }

    public void getOverallUsage(){
        double Gesamtstrom=0;
        for (int i=0; i<Gluehelemente.size();i++){
            Gesamtstrom= Gesamtstrom + Gluehelemente.get(i).getPower();
        }
        System.out.println("Gesamtstrom: "+Gesamtstrom);
    }

    public void printNamesOfLightElements(){
        for (int i=0; i<Gluehelemente.size(); i++){
            System.out.println("Name:" + Gluehelemente.get(i).getName());
        }
    }
}

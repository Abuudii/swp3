package at.ana.basic.Handy;

import java.util.List;

public class Phone {

    private String color;
    private SIM sim;
    private Camera camera;
    private SDCard sdCard;




    public void takePicture(String name){
        sdCard.saveFile(camera.makePicture(name));
    }

    public void printAllFiles(){
        List<PhoneFile> Phonefile = sdCard.getAllFiles();
        for (int i = 0; i<Phonefile.size(); i++){
            System.out.println("Name: " + Phonefile);
        }
    }


    public Phone(String color, SIM sim, Camera camera, SDCard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

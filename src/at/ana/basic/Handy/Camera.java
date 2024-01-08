package at.ana.basic.Handy;

public class Camera {
    private int resolution;

    public PhoneFile makePicture(){
       PhoneFile PH1 = new PhoneFile("png", 20, "jelle");
        return PH1;
    }

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }


    public PhoneFile makePicture(String name) {
        int size= 0;
        PhoneFile P1 = new PhoneFile("png", size, name);
        return P1;
    }
}

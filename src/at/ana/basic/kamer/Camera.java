package at.ana.basic.kamer;

public class Camera {
    private int pixel;
    private double weight;
    private String color;

    private Lens lens;
    SdCard sdCard;



    public Camera(int pixel, double weight, String color) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.lens = lens;
        this.sdCard = sdCard;
    }

    public void takePicture(String name, String date){
        if (sdCard.savePicture()){
            File Bild = new File(name, date, lens.getGroeße() );
            sdCard.savePicture(Bild);
        }
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

package at.ana.basic.kamer;

public class Lens {
    private int pixel;
    private int groeße;
    public void lens(int pixel){
        this.pixel=pixel;
    }




    public Lens(int pixel, int groeße) {
        this.pixel = pixel;
        this.groeße = groeße;
    }


    public int getPixel() {
        if(pixel == 2000){
            groeße = 2;
        } else if (pixel == 4000) {
            groeße = 4;
        } else if (pixel ==6000) {
            groeße=6;
        }
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getGroeße() {
        return groeße;
    }

    public void setGroeße(int groeße) {
        this.groeße = groeße;
    }
}

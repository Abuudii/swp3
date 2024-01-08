package at.ana.basic.kamer;

import java.util.ArrayList;
import java.util.List;

public class SdCard {
    private int Speicher;
    private List<File> files;
    private Lens lens;

    public int FreiSpeicher() {
        int usedSpace = 0;
        for (File file : this.files) {
            usedSpace += (int) file.getSize();
        }
        int freeSpace = Speicher - usedSpace;
        return freeSpace;
    }

    public SdCard(int speicher, Lens lens) {
        Speicher = speicher;
        this.lens = lens;
        this.files = new ArrayList<>();
    }

    public void savePicture(File Bild){
        this.files.add(Bild);
    }

    public void Addfile(java.io.File file) {
        this.files.add(file);
    }

    public int getSpeicher() {
        return Speicher;
    }

    public void setSpeicher(int speicher) {
        Speicher = speicher;
    }

    public List<java.io.File> getFiles() {
        return files;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }
}
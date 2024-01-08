package at.ana.basic.Handy;

import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private int capacity;
    private final List<PhoneFile> phoneFiles;
    private Camera camera;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void saveFile(PhoneFile phoneFile) {
        int freeSpace = getFreeSpace();
        int space = (getCamera() != null) ? getCamera().getResolution() : 0;

        if (freeSpace > space) {
            phoneFiles.add(phoneFile);
            System.out.println("Die Datei wurde erfolgreich gespeichert.");
        } else {
            System.out.println("Sie haben zu wenig Speicherplatz.");
        }
    }

    public int getFreeSpace() {
        int remainingSpace = getCapacity();
        for (PhoneFile file : phoneFiles) {
            remainingSpace -= file.getSize();
        }
        System.out.println("Verfügbarer Speicherplatz: " + remainingSpace);
        return remainingSpace;
    }

    public List<PhoneFile> getAllFiles() {
        for (PhoneFile file : phoneFiles) {
            file.getInfo();
        }
        return new ArrayList<>(phoneFiles);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}

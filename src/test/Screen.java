package test;

import test.window.Size;
import test.window.Window;

import java.util.List;

public class Screen {

    Size screenSize = new Size(800,600);
    List<Window> windows;

    public Screen(Size size) {
        if (validateWindowsSize(size)) {
            this.screenSize = size;
        }
    }

    public void addWindow(Size size) {
        if (!fitWindow()) {
            System.out.print("Spatiu de afisare insuficient! Inchideti o parte din ferestrele afisate pe ecran");
        }

        windows.add(new Window(size));
    }

    private boolean validateWindowsSize(Size size) {
        if(size.getWidth() == 800 && size.getHeight() == 600) {
            return true;
        }
        if(size.getWidth() == 1024 && size.getHeight() == 768) {
            return true;
        }
        if(size.getWidth() == 1280 && size.getHeight() == 720) {
            return true;
        }
        if(size.getWidth() == 1280 && size.getHeight() == 768) {
            return true;
        }
        return false;
    }
}

package test.window;

import test.window.Window;

public class Popup extends Window implements Message, Resizable {

    String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void resize(Size size) {
        if (size.getWidth() < 30 || size.getHeight() < 30 ) {
            return;
        }
        this.setSize(size);
    }
}

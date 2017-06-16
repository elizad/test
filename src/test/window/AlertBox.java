package test.window;

import test.window.Window;

public class AlertBox extends Window implements Message {

    String message;

    @Override
    public String getMessage() {
        return "Atentie! " + message;
    }
}

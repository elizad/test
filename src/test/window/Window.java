package test.window;

public class Window {

    private Size size = new Size(30,30);

    public Window() {
    }

    public Window(Size size) {
        this.size = size;
    }

    protected void setSize(Size size) {

        this.size = size;
    }
}
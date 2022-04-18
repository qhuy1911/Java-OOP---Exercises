package main.exercise1;

public class Display {
    private float size;
    private int numberOfColors;

    public Display(float size, int numberOfColors) {
        this.size = size;
        this.numberOfColors = numberOfColors;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public void setNumberOfColors(int numberOfColors) {
        this.numberOfColors = numberOfColors;
    }
}

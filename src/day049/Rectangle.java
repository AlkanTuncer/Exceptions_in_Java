package day049;

public class Rectangle {

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws LenghtException{
        if (height <= 0) throw new LenghtException();
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws LenghtException{
        if (width <= 0) throw new LenghtException();
        this.width = width;
    }
}

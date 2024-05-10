package Railworld.Day08;

public class Rectanlge {
    private int length;
    private int width;
    public Rectanlge() {
    }
    public Rectanlge(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int calculate_area(){
        return length*width;
    }
    public int calculate_perimeter(){
        return length+width;
    }
}

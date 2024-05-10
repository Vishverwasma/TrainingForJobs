package Railworld.Day08;

public class Circle {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double calculate_area(){
        return 3.14*radius*radius ;
    }
    public double calculate_circumference(){
        return 2*3.14*radius ;
    }
}

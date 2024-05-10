package Railworld.Day08;

public class Employee2 {
    private String name ;
    private String position ;
    private double salary;

    public Employee2(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void promotion(String new_position){
        double incentive = 0.8*salary;
        this.position = new_position;
        this.salary = salary+incentive;
    }
}

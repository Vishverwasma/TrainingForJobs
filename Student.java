package Railworld.Day08;

public class Student {
    public String name;
    private int age;
    private char grade;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public boolean is_teenager(){
        if(age>19 || age<13){
            return false;
        }
        return true;
    }
}

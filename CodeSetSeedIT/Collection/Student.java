package CodeSetSeedIT.Collection;

public class Student implements Comparable<Student> {
    private int roll ;
    private String name ;
    private float marks ;

    public Student() {
    }

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public Student(Student s, int roll){
        if(s.getRoll() == roll){
            s.getRoll();
            s.getName();
            s.getMarks();
        }
    }

    @Override
    public int compareTo(Student newS) {
        if(marks>newS.getMarks()){
            return 1;
        }else{
            return 0;
        }
    }
}

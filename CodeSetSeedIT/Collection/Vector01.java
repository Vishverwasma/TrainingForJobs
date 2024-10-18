package CodeSetSeedIT.Collection;

import java.util.Scanner;
import java.util.Vector;

public class Vector01 {
    public static void main(String[] args) {
        Vector<Student> stu = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Students : ");
        int size = sc.nextInt();
        for(int i = 0 ; i < size ; i++){
            Student s = new Student();
            s.setRoll(i+1);
            System.out.println("Enter a Name : ");
            s.setName(sc.next());
            System.out.println("Enter Marks obtained : ");
            s.setMarks(sc.nextFloat());
            stu.add(s);
        }

        for(Student s : stu){
            System.out.println(s.getRoll()+" : "+s.getName()+" : "+s.getMarks());
        }

        System.out.println("Enter Targetting roll Number : ");
        int roll = sc.nextInt();
        Student target = getByRollNumber(stu , roll);

        System.out.println("Target : \n rollNumber : "+target.getRoll()+" name : "+target.getName()+" : marks : "+target.getMarks());
    }
    public static Student getByRollNumber(Vector<Student> stu , int roll){
        Student target = new Student();
        int cnt = 0;
        for(Student s : stu){
            if(s.getRoll()==roll){
                target.setRoll( s.getRoll() );
                target.setName( s.getName() );
                target.setMarks( s.getMarks() );
                cnt = 0;
                break;
            }
            cnt++;
        }
        if(cnt!=0){
            target.setRoll(0);
            target.setName("NULL");

            target.setMarks(0);
        }
        return target;
    }
}

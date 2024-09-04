package RailworldTraining.Day17;

import java.util.Scanner;

public class nqt03 {
    public static void main(String[] args) {
        String days[] = {"mon","tue","wed","thur","fri","sat","sun"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day : ");
        String day = sc.next();
        System.out.println("Enter number of days : ");
        int n = sc.nextInt() , befSun = 0;
        for(int  i= 0 ; i <days.length;i++){
            if(day.equals(days[i])){
                break;
            }
            int res = 1 ;
            befSun = 6-i ;
            n = n - befSun ;
            if(n>0){
                res = res + (n/7);
            }
            System.out.print(res);
        }
    }
}

package TelegramProjects;

import java.util.Scanner;

public class Calc {
    public static int pow(int n, int power){
        if(power==0 || power==1){
            return n;
        }
        return n*pow(n,power-1);
    }
}
class code{
    public static void main(String[] args) {
        int n;
        System.out.println("Number is : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Raise to The Power of : ");
        int power = sc.nextInt();
        int ans = Calc.pow(n,power);
        System.out.println(n+" to the power of "+power+" is : "+ans);
    }
}
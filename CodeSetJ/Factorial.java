package TelegramProjects;

import java.util.Scanner;

public class Factorial {
    public static int factorialMethod(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorialMethod(n-1);
    }
    public static void main(String[] args) {
        int n,m,factorial1=1;
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(n!=1){
            factorial1=factorial1*n;
            n--;
        }
        int factorial2=factorialMethod(m);
        System.out.println("Factorial of this Number is : "+factorial1+" and Factorial using METHOD implementations is : "+factorial2);
    }
}

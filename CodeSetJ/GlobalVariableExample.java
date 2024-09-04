package TelegramProjects;

import java.util.Scanner;

public class GlobalVariableExample {
    public static int factorial(int num){
        if(num==0 || num==1){
            System.out.println(num);
            return 1;
        }
        System.out.println(num);
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int fact = factorial(n);
        System.out.println("Facotial of "+ n+" is : "+fact);
    }
}


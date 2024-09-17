package TrainingForJobs.CodeSetI;

import java.util.Scanner;

public class Patterns {
    public void pattern01() {
        System.out.println("Pattern 01-----------");
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern02() {
        System.out.println("Pattern 02-----------");
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 5; j>=1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern03() {
        System.out.println("Pattern 03-----------");
        for(int i = 1 ; i<=5 ; i++){
            if(i==1 || i==5){
                for(int j = 1 ; j<=5 ; j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=5;j++){
                    if(j==1 || j==5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public void pattern04(){
        System.out.println("Pattern 04-----------");
        int n = 5;
        for(int i = 1 ; i <= n ; i++){
            for(int j = i ; j < n ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1 ; i>= 1 ;i--){
            for(int j = i ; j<n ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern05(){
        System.out.println("Pattern 05-----------");
        for(int i= 5 ; i>=1 ; i--){
            for(int j = i ; j < 5 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern06(){
        System.out.println("Pattern 06-----------");
        for(int i= 1 ; i <= 5 ; i++){
            for(int j = i ; j <= 5 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern07(){
        System.out.println("Pattern 07-----------");
        for(int i= 1 ; i < 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= 5 ; i >= 1 ; i--){
            for(int j = i ; j >= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern08(){
        System.out.println("Pattern 08-----------");
        for(int i= 1 ; i <= 5 ; i++){
            for(int j = i ; j < 5 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i-1) ; j++){
                if(j==1 || j==(2*i-1) || i==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern09(){
        System.out.println("Pattern 09-----------");
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                if(j==i || j==5-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern10(){
        System.out.println("Pattern 10-----------");
        for(int i = 5/2;i <= 5 ; i+=2){
            for(int j = 1 ; j < 5-i ; j+=2){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=5-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 5 ; i>=1 ; i--){
            for(int j = i ; j<5 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (i*2)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.pattern01();
        p.pattern02();
        p.pattern03();
        p.pattern04();
        p.pattern05();
        p.pattern06();
        p.pattern07();
        p.pattern08();
        p.pattern09();
        p.pattern10();
    }
}

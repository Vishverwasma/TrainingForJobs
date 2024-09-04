package TrainingForJobs.CodeSetI;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NumPattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int dou = 2*n-1;
        for(int i = 1 ; i <= dou ; i++){
            if(i<=n){
                for(int j = 1 ; j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
                System.out.println();
            }else{
                for (int j =  1; j<= dou-i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println();
            }
        }

    }
}

package TrainingForJobs.CodeSetI;

import java.util.Scanner;

public class NumPattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number : ");
        int n = sc.nextInt();
        int dou = 2*n-1;
        for(int i=0 ; i<dou ; i++){
            if(i<n){
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                System.out.println();
            }
            if(i==n){
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                System.out.println();
            }
            if(i>n){
                for(int j=1;j<=dou-i+1;j++){
                    if(j==1 || j==dou-i+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                System.out.println();
            }
        }
        System.out.print("*");
    }
}

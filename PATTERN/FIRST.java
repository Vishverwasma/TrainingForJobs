package PATTERN;

import java.util.Scanner;

public class FIRST {
    public static void main(String[] args) {
        int i,j;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Columns : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

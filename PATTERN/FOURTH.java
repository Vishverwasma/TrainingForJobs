package PATTERN;

import java.util.Scanner;

public class FOURTH {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Columns : ");
        n = sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=n-i;j>=1;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

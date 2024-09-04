package TelegramProjects;

import java.util.Scanner;

public class peakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0 , temp = 0 , max = 0 , size ;
        System.out.println("Size Of this Array is : ");
        size = sc.nextInt();
        int[] n = new int [ size ];
        System.out.println("Element at index ");
        for(i=0 ; i<size ; i++){
            System.out.print(i+" is : ");
            n[i]=sc.nextInt();
            System.out.println();
        }
        max=n[0];
        for(i=0;i<size;i++) {
            if (max <= n[i]) {
                max = n[i];
            }
        }
        System.out.println("The Peek Element in Array is : "+max);
    }
}

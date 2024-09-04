package PATTERN;

import java.util.Scanner;

public class RotateNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("The N : ");
        int n = sc.nextInt();
        System.out.println("Size of Array : ");
        int size = sc.nextInt();
        System.out.println("Elements of Array : ");
        int[] arr = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            temp = arr[0];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = temp;
        }
        System.out.println("Values of Array after rotatition: ");
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}

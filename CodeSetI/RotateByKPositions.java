package CodeSetI;

import java.util.Scanner;

public class RotateByKPositions {
    public static void rotations(int[]arr , int k){
        if(k==0){
            return;
        }
        int temp = arr[0];
        for(int i = 0 ; i< arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        rotations(arr , k-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Elements  : ");
        int length = sc.nextInt();
        System.out.println("Enter Elements in array : ");
        int[] array = new int[length];
        for(int i = 0 ; i< array.length ;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Number of Rotations : ");
        int n = sc.nextInt();
        rotations(array , n);
        System.out.println("After Rotations : ");
        for(int nums : array){
            System.out.print(nums+" ");
        }
    }
}

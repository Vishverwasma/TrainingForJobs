package CodeSetH;

import java.util.Scanner;

public class KthSmallestElement {
    public static void BubbleSort(int[] arr){
        for(int i = 0 ; i <arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l = sc.nextInt();
        int [] arr = new int[l];
        System.out.println("Enter elements to the array : ");
        for(int i = 0; i<l ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Sorting elements : \n On Sorting :");
        BubbleSort(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("\nTarget k-th index is : ");
        int k = sc.nextInt();
        System.out.println("\nAnswer : "+ arr[k]);
        sc.close();
    }
}

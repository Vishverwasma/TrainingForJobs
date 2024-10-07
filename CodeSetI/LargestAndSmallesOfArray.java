package CodeSetI;

import java.util.Scanner;

public class LargestAndSmallesOfArray {
    public static void sortArray(int[] arr){
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void withoutSorting(int[] arr){
        int max = arr[0] , min = arr[0];
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("From this array without Sorting the Smallest is :"+min+"and the Largest is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++){
            arr[i] = sc.nextInt();
        }
        withoutSorting(arr);
        sortArray(arr);
        System.out.println("From this array while Sorting Smallest Element : "+ arr[0]+" and Largest Element : "+arr[arr.length-1]);
    }
}

package CodeSetI;

import java.util.Scanner;

public class FrequentOccurringELement {
    public static void frequency(int[]arr , int[] count) {
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array : ");
        int length = sc. nextInt();
        int[] array = new int[length];
        System.out.println("Elements : ");
        for(int i = 0 ; i < array.length ; i++){
            array[i] = sc.nextInt();
        }
        int[] count = new int[128];
        frequency(array,count);
        int maxOcc = count[array[0]];
        for(int i = 0 ; i < array.length ; i++){
            if(maxOcc<count[array[i]]){
                maxOcc = count[array[i]];
            }
        }
        System.out.println("Element with max occurance is : "+maxOcc);
    }
}

package CodeSetH;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[]arr , int start , int end , int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,start,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,end,target);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array : ");
        int length = sc.nextInt();
        System.out.println("Enter Sorted Arrays Elements only : ");
        int[] arr = new int[length];
        for(int i = 0 ; i<length ; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0 , last = length-1;
        System.out.println("Enter a Target element : ");
        int target = sc.nextInt();
        int result = binarySearch(arr , start , last , target);
        System.out.println("The result index for target : "+target+" is : "+result);
    }
}

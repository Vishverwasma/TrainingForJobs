package RailworldTraining.Day18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicatesRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Size of array is : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements to the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int chk[] = new int[128];
        int cnt = 0;
        Set<Integer> ans = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            ans.add(arr[i]);
        }
        System.out.println("After the removal of elements from array is : ");
        for(int m : ans){
            System.out.print(m+" ");
        }
    }
}

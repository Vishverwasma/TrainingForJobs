package RailworldTraining.Day17;

import java.util.Scanner;

public class nqt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Arrays : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int zeros = 0 , j = 0 ;

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        int zero[] = new int[n];
        int index = 0 ;

        for(int i = 0 ; i<n ; i++){
            if(arr[i]!=0){
                zero[index++] = arr[i];
                j++;
            }
        }

        while(index<n){
            zero[index++]=0;
        }

        System.out.println("After Editing the array : ");

        for(int i = 0 ; i < n ; i++){
            System.out.print(zero[i]+" ");
        }
    }
}

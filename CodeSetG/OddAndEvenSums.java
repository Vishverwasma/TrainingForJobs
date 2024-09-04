package RailworldTraining.Day17;

import java.util.Scanner;

public class OddAndEvenSums {
    public static int oddAdds(int arr[]){
        int os = 0;
        System.out.print("Odd Elements are : ");
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]+" , ");
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%2!=0){
                os = os + arr[i];
            }
        }
        return os;
    }
    public static int evenAdds(int arr[]){
        int es = 0;
        System.out.print("Even Elements are : ");
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" , ");
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i]%2==0){
                es = es + arr[i];
            }
        }
        return es;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("The size of Array is : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int sumOfEvenNumbers = evenAdds(arr) , sumOfOddNumbers = oddAdds(arr);
        System.out.println("The Sum of Odd elements int the array is : "+ sumOfOddNumbers+" and even numbers sums is : "+sumOfEvenNumbers);
    }
}

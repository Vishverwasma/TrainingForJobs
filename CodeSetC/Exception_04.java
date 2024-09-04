package RailworldTraining.Day10;

import java.util.Scanner;

/*
* 4. ArrayIndexOutOfBoundsException Handling:
Write a Java program that declares an array of integers with
a fixed size. Implement exception handling to catch the
ArrayIndexOutOfBoundsException that may occur if the program
tries to access an element at an index beyond the array's bounds.
Provide a suitable error message for this scenario.
* */
public class Exception_04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        try{
            int n ;
            System.out.println("Your Target Index : ");
            n = sc.nextInt();
            System.out.println(arr[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is ArrayIndexOutOfBoundsException Exception");
            e.printStackTrace();
        }finally{
            System.out.println("This is ArrayIndexOutOfBoundsException Example Program");
        }
    }
}

package RailworldTraining.Day10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* 5. InputMismatchException Handling:
Create a Java program that prompts the user to enter an integer.
* Implement exception handling to catch the InputMismatchException
* that may occur if the input provided by the user does not
* match the expected type (i.e., an integer). Provide a meaningful
* error message for this scenario
* */
public class Exception_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        System.out.println("Enter a Numerical String : ");
        s = sc.next();
        try{
            int n = Integer.parseInt(s);
            System.out.println("So The String is in Integer Format !");
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
    }
}

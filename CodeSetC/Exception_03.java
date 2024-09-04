package RailworldTraining.Day10;

import java.util.Scanner;

/*
* 3. *NumberFormatException Handling:*
   Write a Java program that prompts the user to enter a
   * number in string format and converts it to an integer.
   * Implement exception handling to catch the
   * NumberFormatException that may occur if the input
   * cannot be parsed to an integer. Provide a suitable
   * error message for this scenario.

* */
public class Exception_03 {
    public static void main(String[] args) {
        try{
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a Numerical String : ");
            String s = sc.next();
           int n = Integer.parseInt(s);
            System.out.println("The New Number Obtained is : "+n);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}

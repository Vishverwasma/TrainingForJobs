package RailworldTraining.Day10;
/*
* 1. *NullPointerException Handling:*
   Write a Java program that creates an array of integers
   * and tries to access an element at an index that is out of
   * bounds. Implement exception handling to catch the
   * NullPointerException that may occur and print a meaningful
   * error message.
* */
public class Exception_01 {
    public static void main(String[]args) throws NullPointerException {

        String str = null;
        try{
            int size = str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

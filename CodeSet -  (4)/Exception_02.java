package RailworldTraining.Day10;
/*
* 2. *ArithmeticException Handling:*
   Develop a Java program that prompts the user to enter
   * two integers and performs division. Implement exception
   * handling to catch the ArithmeticException that may occur
   * if the user tries to divide by zero. Provide appropriate
   * error messages for both successful division and division by zero cases.

* */
public class Exception_02 {
    public static void main(String[] args) {
        int n = 10;
        try{
            System.out.println(n/0);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}

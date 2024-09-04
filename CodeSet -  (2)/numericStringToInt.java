package Railworld.Day02;

import java.util.Scanner;

public class numericStringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a String : ");
        s=sc.next();
        try{
            int a=Integer.parseInt(s);
            System.out.println("The Integer Value of this String "+s+" is "+a);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

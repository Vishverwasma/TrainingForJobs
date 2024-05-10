package Railworld.Day02;

import java.util.Scanner;

public class CountOccuranceOfGivenChar {
    public static void main(String[] args) {
        String s = new String();
        System.out.println("Your String : ");
        Scanner sc = new Scanner(System.in);
        s= sc.next();
        char []c =s.toCharArray();
        System.out.println("Your target : ");
        char target=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c[i]==target){
                count++;
            }
        }
        System.out.println("The number of Occurance of "+ target +" is "+count);
    }
}

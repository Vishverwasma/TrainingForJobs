package RailworldTraining.Day19;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse : ");
        String s = new String();
        s = sc.next();
        String reversed = reverse(s);
        System.out.println("Reverse of this String : ");
        System.out.println(reversed);
    }
    public static String reverse(String s){
        char[] c = s.toCharArray();
        int left = 0 , right = c.length-1 , k = 0 ;
        while(left<right){
            char swap = c[right];
            c[right]=c[left];
            c[left]=swap;
            left++;right--;
        }
        String ret = new String(c);
        return ret;
    }
}

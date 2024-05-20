package RailworldTraining.Day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//3. *Find Maximum*
//        - Write a Java method to find the maximum value in an ArrayList of integers.
public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int size = sc.nextInt();
        List<Integer> al = new ArrayList<Integer>(size);
        int n;
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < size ; i++){
            n = sc.nextInt();
            al.add(n);
        }
        int max = 0;
        for(int a : al){
            if(max<a){
                max = a;
            }
        }
        System.out.println("The Maximum Element is : "+max);
    }
}

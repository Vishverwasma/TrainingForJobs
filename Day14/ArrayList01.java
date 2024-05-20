package RailworldTraining.Day14;
//1. *Basic Operations*
//        - Write a Java program to create an ArrayList of integers.
//        Add the numbers 1 through 10 to the list, then print the list.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> al = new ArrayList<Integer>(size);
        for(int i = 0; i < size ; i++){
            int n = sc.nextInt();
            al.add(n);
        }
        int j = 1;
        System.out.println("The Elements of this ArrayList is : ");
        for(int a : al){
            System.out.println(j+" "+a);
            j++;
        }
    }
}

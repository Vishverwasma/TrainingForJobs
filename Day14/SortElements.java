package RailworldTraining.Day14;
//4. *Sort Elements*
//        - Write a Java program to sort an ArrayList of strings in alphabetical order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of List : ");
        int size = sc.nextInt();
        List<Integer> al = new ArrayList<Integer>(size);
        int n;
        System.out.println("Enter Elements in Array List : ");
        for(int i=0;i<size;i++){
            n = sc.nextInt();
            al.add(n);
        }
        Collections.sort(al);
        System.out.println("Sorted Array List : ");
        for(int a : al){
            System.out.print(a+" ");
        }
    }
}

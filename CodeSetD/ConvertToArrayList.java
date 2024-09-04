package RailworldTraining.Day14;
//5. *Convert to ArrayList*
//        - Write a Java method to convert a LinkedList of integers to an ArrayList of integers.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConvertToArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Linked List : ");
        int size = sc.nextInt();
        List<Integer> ll = new LinkedList<>();
        int n;
        System.out.println("Elements in the Linked List are : ");
        for(int i = 0 ; i < size ; i++){
            n = sc.nextInt();
            ll.add(n);
        }
        System.out.println("Elements in Linked List is : ");
        for(int l : ll){
            System.out.print(l+" ");
        }
        List<Integer> al = new ArrayList<>();
        for(int l:ll){
            al.add(l);
        }
        System.out.println("Elements in Array List is : ");
        for(int l : al){
            System.out.print(l+" ");
        }
    }
}

package RailworldTraining.Day14;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//1. *Basic Operations*
//        - Write a Java program to create a LinkedList of strings. Add the strings "apple", "banana", "cherry" to the list, then print the list.

public class LinkedList01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Linked List : ");
        int size = sc.nextInt();
        List<String> ll = new LinkedList<String>();
        String n;
        System.out.println("Enter Elements in the Array List : ");
        for(int i= 0;i<size;i++){
            n = sc.next();
            ll.add(n);
        }
        System.out.println("ELements in this String are : ");
        for(String s : ll){
            System.out.print(s+" ");
        }
    }
}

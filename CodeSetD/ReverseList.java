package RailworldTraining.Day14;
//3. *Reverse List*
//        - Write a Java method to reverse a LinkedList of integers.

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of This Linked List are : ");
        int size = sc.nextInt();
        List<Integer> ll = new LinkedList<>();
        int n;
        System.out.println("Enter the Elements to the List : ");
        for(int i = 0;i < size;i++){
            n = sc.nextInt();
            ll.add(n);
        }
        System.out.println("Reverse of This list is : ");
        for(int i=size-1;i>=0;i--){
            System.out.print(ll.get(i)+" ");
        }
    }
}

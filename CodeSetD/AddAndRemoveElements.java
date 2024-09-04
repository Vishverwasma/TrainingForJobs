package RailworldTraining.Day14;
//4. *Add and Remove Elements*
//        - Write a Java program to add elements at the beginning and end of a LinkedList, then remove the first and last elements, and print the final list.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddAndRemoveElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Elements : ");
        int size = sc.nextInt();
        int n;
        System.out.println("Enter Elements to the List : ");
        List<Integer> ll = new LinkedList<>();
        for(int i = 0 ; i < size ; i++){
            n = sc.nextInt();
            ll.add(n);
        }
        System.out.println("So elements of this list are : ");
        for(int x : ll){
            System.out.print(x+" ");
        }
        System.out.println("Enter One more Just One More Element : ");
        n=sc.nextInt();
        ll.add(n);
        System.out.println("So elements of this list are after adding Elements are : ");
        for(int x : ll){
            System.out.print(x+" ");
        }
        System.out.println("Now Lets Remove the elements at index : ");
        int h = sc.nextInt();
        ll.remove(h);
        System.out.println("After Removing Element from index "+h+"  the list be ");
        System.out.println(" ");
        for (int x : ll){
            System.out.print(x+" ");
        }
    }
}

package RailworldTraining.Day14;
//2. *Iterate and Print*
//        - Write a Java method to iterate through a LinkedList of strings and print each element.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IterateAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Linked List : ");
        int size = sc.nextInt();
        List<String> ll = new LinkedList<>();
        String s;
        for(int i = 0 ; i < size ; i++){
            s=sc.next();
            ll.add(s);
        }
        Iterator<String> itr = ll.iterator();
        System.out.println("Elements of this List are : ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}

package RailworldTraining.Day14;
//1. *Basic Operations*
//        - Write a Java program to create a Stack of integers. Push the numbers 1 through 5 onto the stack, then print the stack.

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println("Elements in The Stack are : ");
        Iterator<Integer> itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("Removing The Last Element of Stack : "+s.pop());
    }
}

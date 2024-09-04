package RailworldTraining.Day14;
//2. *Remove Even Numbers*
//        - Write a Java method to remove all even numbers from an ArrayList of integers.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size Of This Array : ");
        int size = sc.nextInt();
        int n;
        List<Integer> al = new ArrayList<Integer>(size);
        System.out.println("Eneter Elements : ");
        for(int i = 0 ; i < size ; i++ ){
            n=sc.nextInt();
            al.add(n);
        }
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            if(itr.next()%2==0){
                itr.remove();
            }
        }
        System.out.println("After Removal of Elements : ");
        for(int a:al ){
            System.out.print(a+" ");
        }
        System.out.print(" . ");
    }
}

package RailworldTraining.Day14;
//5. *Check for Element*
//        - Write a Java method to check if a given integer exists in an ArrayList.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckForElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Size oF List : ");
        int size = sc.nextInt();
        List<Integer> al = new ArrayList<Integer>(size);
        int n;
        System.out.println("Enter Elements to the List : ");
        for (int i=0;i<size;i++){
            n =sc.nextInt();
            al.add(n);
        }
        System.out.println("Element to be found : ");
        int target = sc.nextInt();
        int j=0;
        System.out.println(target+" is present at indexes of list : ");
        for(int x : al){
            if(x==target){
                System.out.print((j+1)+" ,");
            }
            j++;
        }
    }
}

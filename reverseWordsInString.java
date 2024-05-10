package Railworld.Day02;

import java.util.Scanner;

public class reverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s=sc.nextLine();
        String[] split = s.split(" ");
        String temp ;
        int i=0,j=split.length-1;
        while(i<=j){
            temp = split[i];
            split[i]=split[j];
            split[j]=temp;
        }
        for(i=0;i< split.length;i++){
            System.out.println(split[i]);
        }
    }
}
//Incompelete
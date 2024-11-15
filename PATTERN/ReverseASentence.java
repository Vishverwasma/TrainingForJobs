package PATTERN;

import java.util.Scanner;

public class ReverseASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String sent = sc.nextLine();
        String[] words = sent.split(" ");
        String[] reverse = new String[words.length];
        int i = 0 , j = words.length-1;
        while(i<=j){
            reverse[i] = words[j];
            reverse[j] = words[i];
            i++;j--;
        }
        System.out.println("Reverse Sentence is : ");
        for(String word : reverse){
            System.out.print(word+" ");
        }
    }
}

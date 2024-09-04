package PATTERN;

import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Some String to Check : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        String[] words = s.split(" ");
        System.out.println("Nummber os Words : "+ words.length);

        for(int i=0;i< words.length;i++){
            int count =1;
            for(int j = i+1; j< words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "";
                }
            }
            if(count>1){
                System.out.println(words[i]+" : "+count);
            }
        }

    }
}

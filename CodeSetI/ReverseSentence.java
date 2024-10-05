package TrainingForJobs.CodeSetI;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sentence = new String();
        System.out.println("Enter a Sentence : ");
        Sentence = sc.nextLine();
        String[] words = Sentence.split(" ");
        int length = words.length;
        String[] revStr = new String[length];
        int j = 0;
        for(int i = length-1 ; i>=0 ; i--){
            revStr[j] = words[i];
            j++;
        }
        System.out.println("Reverse of This String is : ");
        for(String word : revStr){
            System.out.print(word + " ");
        }
        sc.close();
    }
}

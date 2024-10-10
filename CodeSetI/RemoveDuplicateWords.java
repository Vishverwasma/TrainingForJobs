package TrainingForJobs.CodeSetI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = new String();
        System.out.println("Enter a Sentence : ");
        sentence = sc.nextLine();
        String[] words = sentence.toLowerCase().split(" ");
        Set<String> dupStr = new HashSet<String>();
        for(String word : words){
            dupStr.add(word);
        }
        String[] noDup = new String[dupStr.size()];
        int i = 0;
        for(String word : dupStr){
            noDup[i] = word;
            i++;
        }
        System.out.println("After Duplicate Removal : ");
        for(String word : noDup){
            System.out.println(word + " ");
        }
    }
}

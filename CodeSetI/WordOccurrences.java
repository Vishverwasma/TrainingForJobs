package TrainingForJobs.CodeSetI;

import java.util.HashMap;
import java.util.Scanner;

public class WordOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String[] words = str.toLowerCase().split(" ");

        HashMap<String, Integer> occurrences = new HashMap<>();
        for (String word : words) {
            if (!occurrences.containsKey(word)) {
                occurrences.put(word, 1);  // First occurrence
            } else {
                occurrences.put(word, occurrences.get(word) + 1);  // Increment count
            }
        }

        System.out.println("Word Occurrences:");
        for (String word : occurrences.keySet()) {
            System.out.println(word + ": " + occurrences.get(word));
        }

        sc.close();
    }
}

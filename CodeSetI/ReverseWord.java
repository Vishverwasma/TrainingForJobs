package TrainingForJobs.CodeSetI;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sent = sc.nextLine();

        String[] words = sent.split(" ");
        String[] newSent = new String[words.length];

        int k = 0;
        for (String word : words) {
            char[] ch = word.toCharArray();
            int i = 0, j = word.length() - 1;
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            String reversed = new String(ch);
            newSent[k] = reversed;
            k++;
        }
        System.out.println("Reversed words of the sentence:");
        for (String word : newSent) {
            System.out.print(word + " ");
        }
    }
}

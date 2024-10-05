package TrainingForJobs.CodeSetI;

import java.util.Scanner;

public class CharOccurrance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = new String();
        words = sc.nextLine();
        char[] ch = words.toLowerCase().toCharArray();
        int[]count = new int[128];
        for(char c : ch){
            count[c]++;
        }
        System.out.println("Occurance counnt of each Character is : ");
        for(char c : ch){
            if(count[c]>0){
                System.out.println(c+" : "+count[c]);
                count[c] = 0;
            }
        }
        sc.close();
    }
}

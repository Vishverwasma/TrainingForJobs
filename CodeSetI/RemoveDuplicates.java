package TrainingForJobs.CodeSetI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length : ");
        int len = sc.nextInt();
        String[] arr = new String[len];
        for(int i = 0 ; i<len ; i++){
            arr[i] = sc.next();
        }
        Set<String> dupsRem = new HashSet<>();
        for(String word : arr){
            dupsRem.add(word);
        }
        System.out.println("After Duplicates Removal : ");
        String[] remDups = new String[dupsRem.size()];
        int i = 0;
        for(String word : dupsRem){
            System.out.println(word+" ");
        }
        sc.close();
    }
}

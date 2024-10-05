package TrainingForJobs.CodeSetI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        System.out.println("Size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        Set<Integer> nD = new HashSet<Integer>();
        for(int x : array){
             nD.add(x);
        }
        for(int x: nD){
            System.out.println(x+" ");
        }
    }
}

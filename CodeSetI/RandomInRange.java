package TrainingForJobs.CodeSetI;

import java.util.Scanner;

public class RandomInRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Min and Max of Ranges are : ");
        int min = sc.nextInt() , max = sc.nextInt();
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random Value is : "+ randomValue);
    }
}

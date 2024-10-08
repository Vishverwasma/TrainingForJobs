package CodeSetI;

import java.util.Scanner;

public class PallindromeInRange {
    public static void methodForPallindrome(int min , int max){
        if(min==max){
            return;
        }
        int a = min , rev = 0 , b;
        while(a!=0){
            b=a%10;
            rev = rev*10 + b;
            a = a/10;
        }
        if(min==rev){
            System.out.println(min+" ");
        }
        methodForPallindrome(min+1,max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Min : ");
        int min = sc.nextInt();
        System.out.println("Max : ");
        int max = sc.nextInt();
        methodForPallindrome(min,max);
    }
}

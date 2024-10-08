package CodeSetI;

import java.util.Scanner;

public class PrimeAndPallindormeInRangeWithMethod {
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
    public static void methodForPrime(int min , int max){
        if(min==max){
            return;
        }
        int cnt =0;
        for(int i = 2 ; i<= min/2; i++){
            if(min%i==0){
                cnt=0;
                break;
            }
            cnt++;
        }
        if(cnt!=0) {
            System.out.println(min + " ");
        }
        methodForPrime((min+1) , max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Min : ");
        int min = sc.nextInt();
        System.out.println("Max : ");
        int max = sc.nextInt();
        System.out.println("Primes in this Range are : ");
        methodForPrime(min , max);
        System.out.println("Pallindromes in this Range are : ");
        methodForPallindrome(min , max);
    }
}

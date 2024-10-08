package CodeSetI;

import java.util.Scanner;

public class PrimeInRange {
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
        System.out.println("Enter a Range : ");
        int min = sc.nextInt(), max = sc.nextInt();
        methodForPrime(min,max);
    }
}

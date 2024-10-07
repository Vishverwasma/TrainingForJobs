package CodeSetI;

import java.util.Scanner;

public class PrimeAndPallindormeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Range : ");
        System.out.println("Min : " );int min = sc.nextInt();
        System.out.println("Max : ");int max = sc.nextInt();
        if(min>max){
            int temp = min;
            min = max;
            max = temp;
        }
        System.out.println("All Primes : ");
        for(int i = min ; i  <= max ; i++){
            int cnt = 0;
            for(int j = 2 ; j<=i/2 ;j++){
                if(i%j==0){
                    cnt = 0;
                    break;
                }
                cnt++;
            }
            if(cnt!=0){
                System.out.println(i+" ");
            }
        }
        System.out.println("To Check Pallindormes : ");
        for(int i = min ; i <= max ;i++){
            int a = 0 , b=i , revI = 0;
            while(b!=0){
                a=b%10;
                revI = revI*10+a;
                b=b/10;
            }
            if(i==revI){
                System.out.println(i+" ");
            }
        }
    }
}


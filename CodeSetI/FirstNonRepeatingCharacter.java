package CodeSetI;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();
        char[] c = s.toLowerCase().toCharArray();
        int[] cnt = new int[128];
        for(char x: c){
            cnt[x]++;
        }
        char cZeros='\0';
        for(char x:c){
            if(cnt[x]==1){
                cZeros=x;
                break;
            }
        }
        System.out.println("First Non Repeating Character is : "+cZeros);
    }
}

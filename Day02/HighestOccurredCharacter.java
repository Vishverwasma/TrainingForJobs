package Railworld.Day02;

import java.util.Scanner;

public class HighestOccurredCharacter {
    public static void main(String[] args) {
        int max=0;
        Scanner sc =new Scanner(System.in);
        String s =new String();
        System.out.println("Enter Your String : ");
        s=sc.next();
        char[] c = s.toCharArray();
        int chk[]=new int[128];
        for(int i=0;i<c.length;i++){
            chk[c[i]]++;
        }
        char n = '0';
        for(int i=0;i<c.length;i++){
            if(max<=chk[c[i]] && chk[c[i]]>=1){
                n=c[i];
                max=chk[c[i]];
                chk[c[i]]=0;
            }
        }
        System.out.println("So the Character with maximum frequency is : "+n+" and its repeatation frequency is : "+max);
    }
}

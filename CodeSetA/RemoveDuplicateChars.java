package Railworld.Day02;

import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a String : ");
        s = sc.next();
        char[] x =s.toCharArray();
        int chk[]=new int[128];
        for(int i=0;i<s.length();i++){
            chk[x[i]]++;
        }
        for(int i=0;i<s.length();i++){
            if(chk[x[i]]>=1){
                System.out.print(x[i]+" ");
                chk[x[i]]=0;
            }
        }
    }
}

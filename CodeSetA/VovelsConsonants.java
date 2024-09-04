package Railworld.Day02;

import java.util.Scanner;

public class VovelsConsonants {
    public static void main(String[] args) {
        int vovels =0,consonants =0;
        String s = new String();
        System.out.println("Enter a Sttring : ");
        Scanner sc =new Scanner(System.in);
        s= sc.next();
        char[]c =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
                vovels++;
            }else{
                consonants++;
            }
        }
        System.out.println("The String "+s+ " contains "+vovels+" number of Vovels and "+consonants+" number of Constonants !" );
    }
}

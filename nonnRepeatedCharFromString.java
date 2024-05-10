package Railworld.Day02;

import java.util.Scanner;

public class nonnRepeatedCharFromString {
    public static void main(String[] args) {
                String s = new String();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a String : ");
                s =sc.next();
                char[] c=s.toCharArray();
                char[] chk=new char[128];
                for(int i=0;i<s.length();i++){
                    chk[c[i]]++;
                }
                System.out.println("The Non-Repeating Characters in this string "+s+" is : ");
                for(int i=0;i<chk.length;i++){
                    if(chk[i]==1){
                        System.out.println((char)i);
                    }
                }
            }
        }

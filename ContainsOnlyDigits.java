package Railworld.Day02;

import java.util.Scanner;

public class ContainsOnlyDigits {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        s = sc.next();
        int cnt=0;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='0' && c[i]<='9'){
                cnt++;
            }else{
                cnt=0;
                System.out.println("This String "+s+" does not contains DIGITs only ");
                break;
            }
        }
        if(cnt>0){
            System.out.println("This String "+s+" contains DIGITs ");
        }
    }
}

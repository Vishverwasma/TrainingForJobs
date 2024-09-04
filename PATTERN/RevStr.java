package PATTERN;

import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        char rev ;
        int i=0,j=s.length()-1;
        while(i<=j){
            rev= c[i];
            c[i]=c[j];
            c[j]=rev;
            i++;j--;
        }
        int k=0;
        String newS = new String (c);
        s=newS;
        System.out.println("After Reversing String we obtain : "+s);
    }
}

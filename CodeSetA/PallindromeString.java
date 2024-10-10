package CodeSetA;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter String to be Checked : ");
        s=sc.next();
        char[] c = s.toCharArray();
        int i=0,cnt=0,j=s.length()-1;
        System.out.println("Check for it Being Pallindrome : ");
        while(i<=j){
            if(c[i]!=c[j]){
                break;
            }
            i++;j--;
            cnt++;
        }
        if(cnt>=s.length()/2-1){
            System.out.println("This is a Plaindrome");
        }else{
            System.out.println("This is not a Palindrome");
        }
    }
}

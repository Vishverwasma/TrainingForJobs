package TelegramProjects;

import java.util.Scanner;

public class toUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a String to convert it To Upper Case : ");
        s = sc.nextLine();
        char[] c = s.toCharArray();
        int i;
        for(i=0;i<s.length();i++){
            if(c[i]>=97 && c[i]<=122){
                c[i] -= 32 ;
            }
        }
        System.out.println(c);
    }
}

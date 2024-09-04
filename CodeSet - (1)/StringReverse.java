package TelegramProjects;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String : ");
        s=sc.nextLine();
        char[] c=s.toCharArray();
        int start=0,end=c.length-1;
        char temp;
        while(start<=end){
            temp=c[end];
            c[end]=c[start];
            c[start]=temp;
            start++;
            end--;
        }
        System.out.println(c);
    }
}

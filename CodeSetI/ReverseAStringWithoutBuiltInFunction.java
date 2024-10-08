package CodeSetI;

import java.util.Scanner;

public class ReverseAStringWithoutBuiltInFunction {
    public static void reverse(char[] ch){
        int i = 0 , j = ch.length - 1;
        while(i<=j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = new String(sc.next());
        char[] ch = s.toCharArray();
        reverse(ch);
        String revString = new String(ch);
        System.out.println("reverse of this String is : \n"+revString);
    }
}

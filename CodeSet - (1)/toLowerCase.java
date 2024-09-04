package TelegramProjects;

import java.util.Scanner;

public class toLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=new String();
        System.out.println("Enter your String : ");
        s=sc.nextLine();
        int in=0;
        char[] c=s.toCharArray();
        int i;
        for(i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90){
                c[i] += 32;
            }
        }
        System.out.println(c);
    }
}

package RailworldTraining.Day17;

import java.util.Scanner;

public class RepeatingCharacters {
    public static void main(String[] args) {
        int[] ch= new int[128];
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = new String();
        s = sc.nextLine();
        String newS = s.toLowerCase();
        char [] c = newS.toCharArray();
        for(int i = 0 ;i<c.length;i++){
            ch[c[i]]++;
        }
        System.out.println("Repeating Frequency of Characters are : ");
        for(int i = 0; i <c.length;i++){
            if(c[i]==32 && ch[c[i]]>1){
                System.out.println("Space : "+ch[c[i]]);
                ch[c[i]] = 0;
            }
            if(ch[c[i]]>1){
                System.out.println(c[i]+" : "+ch[c[i]]);
                ch[c[i]]=0;
            }
        }
    }
}

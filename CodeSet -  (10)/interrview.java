package RailworldTraining.Day19;

import java.util.Scanner;

public class interrview {

    public int add(int n,int m){
        return n+m;
    }
    public int add(int n, int m , int o){
        return n+m+o;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any String to check repeating characters : ");
        s = sc.nextLine();
        char[] c = s.toCharArray();
        int chk[]=new int[128];
        for(int i = 0 ; i<c.length;i++){
            chk[c[i]]++;
        }
        System.out.println("To check the number of times this characters are repeating : ");
        for(int i = 0 ; i <c.length ; i++){
            if(chk[c[i]]>0){
                System.out.println(c[i]+" : "+chk[c[i]]);
                chk[c[i]]=0;
            }
        }
    }
}

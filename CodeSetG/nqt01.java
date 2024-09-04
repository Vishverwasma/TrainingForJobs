package RailworldTraining.Day17;

import java.util.Scanner;

public class nqt01 {
    public static void main(String[] args) {
        String str[] = {"break","case","continue","default","defer",
                "else","for","return","struct","type","var"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to be Checked : ");
        String s = sc.next();
        s= s.toLowerCase();
        boolean tr = true;
        for(int i = 0 ; i < s.length() ; i++){
            if(str[i].equals(s)){
                System.out.println(s+" is a Keyword ! ");
                break;
            }
            else {
                tr = false;
            }
        }
        if(tr==false){
            System.out.println(s+" is not a Keyword ! ");
        }
    }
}

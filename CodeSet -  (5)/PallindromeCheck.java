package RailworldTraining.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//3. *Palindrome Check*
//        - Write a Java method to check if a given string is a palindrome using a Stack.
public class PallindromeCheck {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(3);
        st.push(2);
        st.push(1);
        List<Integer> al =new ArrayList<>();
        al.addAll(st);
        int i = 0 , j = al.size()-1 , ctr =1;
        while(i<=j){
            if(al.get(i)!=al.get(j)){
                ctr =0 ;
                break;
            }
            ctr++;
            i++;j--;
        }
        if(ctr!=0){
            System.out.println("Its a Pallindrome !");
        }
        else{
            System.out.println("Its not a Pallindrome !");
        }
    }
}

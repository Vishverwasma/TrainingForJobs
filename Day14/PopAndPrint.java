package RailworldTraining.Day14;
//2. *Pop and Print*
//        - Write a Java method to pop all elements from a Stack and print each element.

import java.util.List;
import java.util.Stack;

public class PopAndPrint {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println("On Popping Out we not only Remove last element that is "+st.pop()+" and so new Stack becomes as : ");
        System.out.println(" ");
        for(int x : st){
            System.out.print(x+" ");
        }
    }
}

package RailworldTraining.Day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//2. *Reverse a Queue*
//        - *Description*: Given a queue, write a function to reverse the elements of the queue.

public class ReversEaQueuE {
    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed queue: " + queue);
    }
}

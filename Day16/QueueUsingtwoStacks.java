package RailworldTraining.Day16;
//1. *Implement a Queue using Two Stacks*
//        - *Description*: Write a class that implements a queue using two stacks. Implement the standard queue operations: enqueue, dequeue, peek, and isEmpty.

import java.util.Stack;

public class QueueUsingtwoStacks<T> {
     private Stack<T> s1 , s2;

    public QueueUsingtwoStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void enqueue(T ele){
        s1.push(ele);
    }
    public T dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            throw new RuntimeException("Dequeue from an empty queue");
        }
        return s2.pop();
    }
    public T peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            throw new RuntimeException("Peek from an empty queue");
        }
        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingtwoStacks<Integer> queue = new QueueUsingtwoStacks<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.peek());     // Output: 2
        System.out.println(queue.isEmpty());  // Output: false
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty());  // Output: true
    }
}

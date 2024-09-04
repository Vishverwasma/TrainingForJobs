package RailworldTraining.Day16;
//8. *Check if a Queue is Palindrome*
//        - *Description*: Write a function to check if the elements of a queue form a palindrome.

import java.util.LinkedList;
import java.util.Queue;

    public class QI_QueueIsPalindorme {

        public static boolean isPalindrome(Queue<Character> queue) {
            LinkedList<Character> list = new LinkedList<>(queue);

            // Check if the list is a palindrome
            while (!list.isEmpty()) {
                if (list.size() == 1) {
                    return true; // Single element is always a palindrome
                }
                char first = list.removeFirst();
                char last = list.removeLast();
                if (first != last) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Queue<Character> queue1 = new LinkedList<>();
            queue1.add('a');
            queue1.add('b');
            queue1.add('c');
            queue1.add('b');
            queue1.add('a');

            Queue<Character> queue2 = new LinkedList<>();
            queue2.add('r');
            queue2.add('a');
            queue2.add('c');
            queue2.add('e');
            queue2.add('c');
            queue2.add('a');
            queue2.add('r');

            System.out.println("Is queue1 a palindrome? " + isPalindrome(queue1)); // true
            System.out.println("Is queue2 a palindrome? " + isPalindrome(queue2)); // true
        }
    }


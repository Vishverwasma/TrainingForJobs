package RailworldTraining.Day16;
//10. *Find the Maximum Element in a Queue*
//        - *Description*: Write a function to find the maximum element in a queue without using any additional data structures.

import java.util.LinkedList;
import java.util.Queue;

    public class QI_FindMaxElementInQueue {

        public static int findMaxElement(Queue<Integer> queue) {
            if (queue.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            int maxElement = queue.peek();
            for (int i = 0; i < queue.size(); i++) {
                int currentElement = queue.poll();
                maxElement = Math.max(maxElement, currentElement);
                queue.add(currentElement);
            }

            return maxElement;
        }

        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(5);
            queue.add(8);
            queue.add(3);
            queue.add(12);
            queue.add(6);

            System.out.println("Maximum element in the queue: " + findMaxElement(queue)); // 12
        }
    }

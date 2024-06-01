package RailworldTraining.Day16;
//6. *Sort a Queue*
//        - *Description*: Write a function to sort the elements of a queue in ascending order.

import java.util.LinkedList;
import java.util.Queue;

    public class QI_SorTaQueue {

        public static void sortQueue(Queue<Integer> queue) {
            // Dequeue all elements into a list
            LinkedList<Integer> list = new LinkedList<>();
            while (!queue.isEmpty()) {
                list.add(queue.poll());
            }

            // Sort the list
            list.sort(null); // natural ordering

            // Enqueue the sorted elements back into the queue
            for (Integer num : list) {
                queue.offer(num);
            }
        }

        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(5);
            queue.offer(3);
            queue.offer(8);
            queue.offer(1);
            queue.offer(4);

            System.out.println("Original queue: " + queue);
            sortQueue(queue);
            System.out.println("Sorted queue: " + queue);
        }
    }


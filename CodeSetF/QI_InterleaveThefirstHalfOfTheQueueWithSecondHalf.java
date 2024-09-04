package RailworldTraining.Day16;
//9. *Interleave the First Half of the Queue with the Second Half*
//        - *Description*: Given a queue of integers, interleave the first half of the queue with the second half.

import java.util.LinkedList;
import java.util.Queue;

    public class QI_InterleaveThefirstHalfOfTheQueueWithSecondHalf {

        public static void interleave(Queue<Integer> queue) {
            int size = queue.size();
            int halfSize = size / 2;

            // Temporary queue to store the second half
            Queue<Integer> tempQueue = new LinkedList<>();
            for (int i = 0; i < halfSize; i++) {
                tempQueue.add(queue.poll());
            }

            // Interleave elements
            while (!tempQueue.isEmpty()) {
                queue.add(tempQueue.poll());
                if (!queue.isEmpty()) {
                    queue.add(queue.poll());
                }
            }
        }

        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);

            System.out.println("Original queue: " + queue);
            interleave(queue);
            System.out.println("Interleaved queue: " + queue);
        }
    }

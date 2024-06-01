package RailworldTraining.Day16;
//3. *Generate Binary Numbers from 1 to N using a Queue*
//        - *Description*: Write a function that takes an integer N and generates binary numbers from 1 to N using a queue.

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumber1toN {
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        int count = 0;
        while (count < N) {
            String current = queue.poll();
            System.out.println(current);
            count++;

            // Enqueue the next two binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int N = 10; // Example value, you can change this to any positive integer
        generateBinaryNumbers(N);
    }
}

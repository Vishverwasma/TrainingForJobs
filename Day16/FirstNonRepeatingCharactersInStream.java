package RailworldTraining.Day16;
//5. *Find the First Non-Repeating Character in a Stream*
//        - *Description*: Given a stream of characters, find the first non-repeating character each time a character is added to the stream.

import java.util.*;

public class FirstNonRepeatingCharactersInStream {
    private Queue<Character> queue;
    private HashMap<Character, Integer> charCount;

    public FirstNonRepeatingCharactersInStream() {
        queue = new LinkedList<>();
        charCount = new HashMap<>();
    }

    public void add(char c) {
        // Add the character to the queue and update its count in the hash map
        queue.add(c);
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);

        // Remove characters from the queue until the front of the queue is non-repeating
        while (!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
            queue.poll();
        }
    }

    public Character firstNonRepeating() {
        // The front of the queue is the first non-repeating character
        return queue.isEmpty() ? null : queue.peek();
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharactersInStream stream = new FirstNonRepeatingCharactersInStream();

        String input = "aabcddbe";
        for (char c : input.toCharArray()) {
            stream.add(c);
            Character firstNonRepeating = stream.firstNonRepeating();
            System.out.println("First non-repeating character: " + (firstNonRepeating != null ? firstNonRepeating : "None"));
        }
    }
}

package RailworldTraining.Day16;
//7. *Implement a Priority Queue*
//        - *Description*: Implement a priority queue where elements are dequeued based on their priority. Use a min-heap or max-heap to manage the priorities.

import java.util.*;

public class QI_ImplementingPriorityQueue {
    private List<Integer> heap;

    public QI_ImplementingPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(int value) {
        heap.add(value);
        int currentIndex = heap.size() - 1;
        heapifyUp(currentIndex);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        int minItem = peek();
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heapifyDown(0);
        }
        return minItem;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) < heap.get(parentIndex)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallestChild = leftChild;
            if (rightChild < size && heap.get(rightChild) < heap.get(leftChild)) {
                smallestChild = rightChild;
            }
            if (heap.get(index) > heap.get(smallestChild)) {
                swap(index, smallestChild);
                index = smallestChild;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        QI_ImplementingPriorityQueue pq = new QI_ImplementingPriorityQueue();
        pq.enqueue(3);
        pq.enqueue(2);
        pq.enqueue(4);
        pq.enqueue(1);
        pq.enqueue(5);

        System.out.println("Dequeued elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }
    }
}
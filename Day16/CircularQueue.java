package RailworldTraining.Day16;
//4. *Implement a Circular Queue*
//        - *Description*: Implement a circular queue with a fixed size. Support the operations enqueue, dequeue, front, rear, isEmpty, and isFull.

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean enqueue(int item) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        System.out.println("Enqueue 1: " + cq.enqueue(1));  // true
        System.out.println("Enqueue 2: " + cq.enqueue(2));  // true
        System.out.println("Enqueue 3: " + cq.enqueue(3));  // true
        System.out.println("Enqueue 4: " + cq.enqueue(4));  // true
        System.out.println("Enqueue 5: " + cq.enqueue(5));  // true
        System.out.println("Enqueue 6 (should be false, queue is full): " + cq.enqueue(6));  // false

        System.out.println("Front element: " + cq.front()); // 1
        System.out.println("Rear element: " + cq.rear());   // 5

        System.out.println("Dequeue: " + cq.dequeue()); // 1
        System.out.println("Dequeue: " + cq.dequeue()); // 2

        System.out.println("Enqueue 6: " + cq.enqueue(6));  // true
        System.out.println("Front element: " + cq.front()); // 3
        System.out.println("Rear element: " + cq.rear());   // 6

        System.out.println("Is queue empty? " + cq.isEmpty());  // false
        System.out.println("Is queue full? " + cq.isFull());    // true
    }
}

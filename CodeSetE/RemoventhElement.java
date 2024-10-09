package CodeSetE;

import java.util.Scanner;

public class RemoventhElement {
    public static linkedListNode nthRemoval(linkedListNode head , int nth){
        linkedListNode dummy = new linkedListNode(0);
        dummy.next = head;
        linkedListNode first = dummy;
        linkedListNode second = dummy;

        for(int i = 0 ; i <= nth ;i++){
            first=first.next;
        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void printList(linkedListNode curr){
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Nodes in list 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter values for the Linked List : ");
        linkedListNode head = new linkedListNode(sc.nextInt());
        linkedListNode current = head;

        for(int i = 1 ; i < num1  ; i++){
            int value = sc.nextInt();
            current.next = new linkedListNode(value);
            current = current.next;
        }
        System.out.println("Nth from where removal is to done : ");
        int nth = sc.nextInt();

        System.out.println("Orignal Linked List 1 : ");
        printList(head);

        head = nthRemoval(head , nth);
        System.out.println("After removal nth element from List we get : ");
        printList(head);

        sc.close();
    }
}
package CodeSetE;

import java.util.Scanner;

public class ReversingLinkedList {
   public static linkedListNode reverse(linkedListNode head){
       if(head == null || head.next == null){
           return head;
       }
       linkedListNode revHead = reverse(head.next);
       head.next.next = head;
       head.next = null;
       return revHead;
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
        System.out.println("Enter number of Nodes : ");
        int num = sc.nextInt();
        if(num<=0){
            System.out.println("Please Enter a Valid number of Nodes : ");
            num = sc.nextInt();
            if(num<=0){
                System.out.println("Seems You Are not serious ! ");
                sc.close();
                return;
            }
        }
        System.out.println("Enter values for the Linked List : ");
        linkedListNode head = new linkedListNode(sc.nextInt());
        linkedListNode current = head;

        for(int i = 1 ; i < num  ; i++){
            int value = sc.nextInt();
            current.next = new linkedListNode(value);
            current = current.next;
        }

        System.out.println("Orignal Linked List : ");
        printList(head);

        head = reverse(head);
        System.out.println("Reversed Linked List : ");
        printList(head);

        sc.close();
    }
}

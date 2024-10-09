package CodeSetE;

import java.util.Scanner;

public class MiddleNode {
    public static linkedListNode middleNode(linkedListNode head){
        if(head == null){
            return null;
        }
        linkedListNode slow = head;
        linkedListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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

        linkedListNode middle = middleNode(head);
        System.out.println("Middle Node of this Linked List : ");
        if(middle!=null){
            System.out.println(middle);
        }else{
            System.out.println("This is an Empty Linked List !");
        }

        sc.close();
    }
}


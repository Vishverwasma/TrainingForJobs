package CodeSetE;

import java.util.Scanner;

public class MergeTwoList {
    public static linkedListNode mergeTwoList(linkedListNode n1 , linkedListNode n2){
        linkedListNode dummy = new linkedListNode(-1);
        linkedListNode tail = dummy;
        while(n1!=null && n2!=null){
            if(n1.data <= n2.data){
                tail.next = n1;
                n1 = n1.next;
            }else{
                tail.next = n2;
                n2 = n2.next;
            }
            tail = tail.next;
        }
        if(n1!=null){
            tail.next = n1;
        }else{
            tail.next = n2;
        }
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
        linkedListNode head1 = new linkedListNode(sc.nextInt());
        linkedListNode current1 = head1;

        for(int i = 1 ; i < num1  ; i++){
            int value = sc.nextInt();
            current1.next = new linkedListNode(value);
            current1 = current1.next;
        }


        System.out.println("Enter number of Nodes in list 1 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter values for the Linked List : ");
        linkedListNode head2 = new linkedListNode(sc.nextInt());
        linkedListNode current2 = head2;

        for(int i = 1 ; i < num2  ; i++){
            int value = sc.nextInt();
            current2.next = new linkedListNode(value);
            current2 = current2.next;
        }


        System.out.println("Orignal Linked List 1 : ");
        printList(head1);
        System.out.println("Orignal Linked List 2 : ");
        printList(head2);


        linkedListNode mergedList = mergeTwoList(head1 , head2);
        System.out.println("After Merging List comes out as : ");
        printList(mergedList);

        sc.close();
    }
}


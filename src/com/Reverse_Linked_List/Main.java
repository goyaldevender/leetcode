package com.Reverse_Linked_List;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int num) {
        val = num;
    }
}

public class Main {

    static ListNode head;

    static void reverseList(ListNode node) {
        if (node == null)
            return;
        if (node.next == null) {
            head = node;
            return;
        }

        reverseList(node.next);

        node.next.next = node;
        node.next = null;
    }

    static void printList(ListNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        printList(node.next);
    }

    public static void main(String[] args) {

        // The below line is used to print the output
        System.out.println("facebook Vs Google");

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        System.out.println();
        reverseList(head);
        printList(head);
    }
}

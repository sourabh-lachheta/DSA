package com.LinkedList.problems;


public class ReverseLinkedList_206 {

    public static class ListNode{
        int val;
        ListNode next;

       public ListNode(){

        }

        public ListNode(int val){
            this.val = val;
        }

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }





   public static ListNode reverseList(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public static void display(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args){

     ListNode node1 = new ListNode(1);
     ListNode node2 = new ListNode(2);
     ListNode node3 = new ListNode(3);
     ListNode node4 = new ListNode(4);

     node1.next = node2;
     node2.next = node3;
     node3.next = node4;

     display(node1);


     ListNode head = reverseList(node1);

     ListNode current = head;

     while(current != null){
         System.out.print(current.val + " -> ");
         current = current.next;
     }
        System.out.println("null");

    }
}

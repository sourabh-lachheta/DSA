package com.LinkedList.main;

public class DLL {

    private Node head;

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prv = null;
        if(head != null){
            head.prv = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " ->");
            node = node.next;
        }
        System.out.println("END");
    }

    private class Node{
         int val;
         Node next;
         Node prv;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prv){
            this.val = val;
            this.next = next;
            this.prv = prv;
        }
    }
}

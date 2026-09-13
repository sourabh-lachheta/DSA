package com.LinkedList.linkedListUsingRecursion;

public class LL {


    private Node head;
    private Node tail;

   private int size;



   //insert using recursion

    public void insertRec(int value, int index){

        head = insertRec(value, index, head);

    }

    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }



    public void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}

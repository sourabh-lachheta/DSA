package com.LinkedList.main;

public class LL {


    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }


    // inset at first
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;

        }

        size += 1;
    }


  public void insertAtLast(int val){

        if(tail == null){
            insertAtFirst(val);
        }
        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        size++;
  }


  public void insertAtIndex(int val, int index){
        if(index == 0){
            insertAtFirst(val);
            return;
        }

        if(index == size){
            insertAtLast(val);
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

  }


  public int deleteAtFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
  }

  public int deleteAtLast(){
        if(size <= 1){
            deleteAtFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        return val;


  }

  public Node get(int index){
        Node node = head;
        for(int i = 1; i < index; i++){
           node =  node.next;
        }

        return node;
  }

  public int deleteAtIndex(int index){
        if(index == 0){
            deleteAtFirst();
        }

        if(index == size-1){
            deleteAtLast();
        }

        Node perv = get(index -1);
        int val = perv.next.val;

        perv.next = perv.next.next;

        return val;
  }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }


    }
}

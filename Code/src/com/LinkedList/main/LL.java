package com.LinkedList.main;

public class LL {



    private ListNode head;
    private ListNode tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public ListNode getHead() {
        return head;
    }


    // inset at first
    public void insertAtFirst(int val){
        ListNode node = new ListNode(val);
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
            return;
        }
        ListNode node =  new ListNode(val);
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

        ListNode temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        ListNode node = new ListNode(val, temp.next);
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

        ListNode secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        return val;


  }

  public ListNode get(int index){
        ListNode node = head;
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

        ListNode perv = get(index -1);
        int val = perv.next.val;

        perv.next = perv.next.next;

        return val;
  }


    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static class ListNode{
        public int val;
        public ListNode next;

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
}

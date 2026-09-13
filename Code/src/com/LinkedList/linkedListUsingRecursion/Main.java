package com.LinkedList.linkedListUsingRecursion;

public class Main {

    public static void main(String[] args){
        LL list = new LL();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.display();
        list.insertRec(6,1);
        list.display();
    }
}

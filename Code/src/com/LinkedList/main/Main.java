package com.LinkedList.main;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        LL list = new LL();

        list.insertAtFirst(4);
        list.insertAtFirst(7);
        list.insertAtFirst(6);
        list.insertAtFirst(9);
        list.insertAtLast(10);
        list.insertAtIndex(34,2);
        list.display();
        System.out.println( list.deleteAtFirst());


        list.display();
        System.out.println(list.deleteAtLast());
        list.display();
        System.out.println(list.deleteAtIndex(1));
        list.display();

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);


        for(int i = 0; i < )
    }
}

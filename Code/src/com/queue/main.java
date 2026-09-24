package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(9);
        queue.add(10);
        queue.add(3);

        queue.remove(); //poll
      //  System.out.println(queue);



        //Deque

        Deque<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(5);
        q.add(4);
        q.add(5);
        q.add(9);

       // System.out.println(q);

     //   q.remove();
        q.remove(5);


       // System.out.println(q);

        CustomQueue que = new CustomQueue(5);

        que.insert(3);
        que.insert(7);
        que.insert(9);

        que.remove();

        que.display();








    }
}

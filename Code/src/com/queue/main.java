package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(9);
        queue.add(10);
        queue.add(3);
       // queue.poll();
        queue.remove();
        System.out.println(queue);
    }
}

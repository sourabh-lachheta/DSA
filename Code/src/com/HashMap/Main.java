package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"sourabh");
        map.put(102,"alex");
        map.put(101,"ss");
        System.out.println(map);

        // iteration
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}

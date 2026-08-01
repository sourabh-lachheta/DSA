package com.Random;

import java.util.*;

public class NumberOfPush_3016 {

    static int minimumPushes(String word) {
        int sum = 0;
        for(int i = 0; i < word.length(); i++){
            int num = solve(word.charAt(i));
            sum = sum + num;

        }
        return sum;

    }

    static  int solve(char word){
        List<Character> list = new ArrayList<>();
        int push = 0;

        if(list.contains(word) == false){
            list.add(word);
        }

        if(list.size() <= 7){
            push = 1;
        }
        if(list.size() <= 15 && list.size() >= 8){
            push = 2;
        }
        if(list.size() <=23 && list.size() >=16){
            push = 3;
        }
        if(list.size() <= 26 && list.size() > 23 ){
            push = 4;
        }

        return push;

    }


    public static void main(String[] args){
        String word = "xyzxyzxyzxyz";
        System.out.println(minimumPushes(word));
        }


}

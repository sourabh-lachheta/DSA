package com.Random;

import java.util.ArrayList;
import java.util.List;

public class NumberOFPush_3014 {

    static int minimumPushes(String word) {
        int push = 0;
        int sum =0;
        for(int i = 0; i<word.length(); i++){
            if(i <= 7 ){
                push = 1;
            }
            if(i <= 15 && i >= 8){
                push = 2;
            }
            if(i <=23 && i >=16){
                push = 3;
            }
            if(i <= 26 && i > 23 ){
                push = 4;
            }
            sum = sum + push;
        }
    return sum;

    }




    public static void main(String[] args){
        String word = "abcdefghijk";
        System.out.println(minimumPushes(word));

    }
}

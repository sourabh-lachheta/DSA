package com.Recursion.Problems;

public class Fibo {

    static int nums(int n){
        if(n  < 3){
            return n;
        }
        return nums(n-1) + nums(n-2);
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println( nums(n));


    }
}

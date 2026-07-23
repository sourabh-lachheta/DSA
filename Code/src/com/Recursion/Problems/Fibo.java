package com.Recursion.Problems;

public class Fibo {

    static int nums(int n){
        if(n  < 2){
            return n;
        }
        return nums(n-1) + nums(n-2);
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println( nums(n));


    }
}

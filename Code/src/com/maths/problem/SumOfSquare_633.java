package com.maths.problem;

import java.util.HashSet;

public class SumOfSquare_633 {

    public static boolean judgeSquareSum(int c) {

        return solve(c);

    }

    private static boolean solve(int c){

        HashSet<Long> set = new HashSet<>();
        long n = 0;

        while(n*n <= c){
            set.add(n*n);
            n++;
        }

        for(long num : set){

            long target = c - num;

            if(set.contains(target)){
                return true;
            }

        }

        return false;


    }

    public static void main(String[] args){
        int c = 5;
        System.out.println(judgeSquareSum(c));
    }
}

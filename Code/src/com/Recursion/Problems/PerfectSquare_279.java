package com.Recursion.Problems;

public class PerfectSquare_279 {

    static  int numSquares(int n) {
        int count = 0;
        for(int i = n; i>=0; i-- ){
            int sqr = i*i;

            if(sqr == n){
                count =  1;
                return count;
            }

            

        }
    }
    public static void main(String[] args){
        int num = 12;
        System.out.println(numSquares(num));
    }
}

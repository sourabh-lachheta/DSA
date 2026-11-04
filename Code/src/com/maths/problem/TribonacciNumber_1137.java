package com.maths.problem;

public class TribonacciNumber_1137 {
    public static  int tribonacci(int n) {

        if(n == 0){
            return 0;
        }
        if(n <= 2){
            return 1;
        }


        int t1  = 0, t2 = 1, t3 = 1, s = 2, sum = 0;

        while(s < n){
            s++;
            sum = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = sum;
        }

        return sum;

    }

    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(tribonacci(n));
    }
}


// LeetCode = 69 sqrt(x)


package com.Problems;

public class Sqrt_69 {
    class Solution{
        public static int mysqrt(int x){
             x = x^(1/2);
            return x;
        }
    }

    public static void main(String[] args){
        int x = 4;
        System.out.println(Solution.mysqrt(x));
    }
}

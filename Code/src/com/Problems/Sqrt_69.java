
// LeetCode = 69 sqrt(x)


package com.Problems;

public class Sqrt_69 {
    static class Solution{
        public static int mysqrt(int x){
            int start = 0;
            int end = x;
            int ans = 0;
            while(start <= end){
                int mid = start + (end - start)/2;
                long s = (long) mid * mid; // to avoid overflow of int
                if(s == x){
                    return mid;
                }
                if(s > x){
                    end = mid -1;
                }else{
                    start = mid + 1;
                    ans = mid;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args){
        int x = 8;
        System.out.println(Solution.mysqrt(x));
    }
}

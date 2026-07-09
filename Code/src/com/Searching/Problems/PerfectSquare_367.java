

// LeetCode 367:  Valid Perfect Square

package com.Searching.Problems;
public class PerfectSquare_367 {

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid * mid == num){
                return true;
            }
            if(mid*mid > num){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return false;
    }
    public static void main(String[] args){

        int num = 9;
        System.out.println(isPerfectSquare(num));

    }
}

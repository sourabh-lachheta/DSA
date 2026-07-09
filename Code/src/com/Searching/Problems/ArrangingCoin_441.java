

// LeetCode 441 :  Arranging coins

package com.Searching.Problems;

public class ArrangingCoin_441 {
    public static int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        int mid = 0;
        while (start <= end) {
             mid = start + (end - start) / 2;
            long coinsNeeded = (long)mid * (mid + 1) / 2;
            System.out.println(coinsNeeded);
            if(coinsNeeded == n){
                return mid;
            }
            if (coinsNeeded > n) {
                end = mid - 1;
            }if(coinsNeeded < n){
                start = mid + 1;
            }
        }
        return end;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}

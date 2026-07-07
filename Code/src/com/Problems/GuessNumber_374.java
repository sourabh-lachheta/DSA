

// LeetCode = 374. Guess Number Higher or Lower



package com.Problems;

public class GuessNumber_374 {

    static public class Solution{
        static public  int guessNumber(int n) {
            int start = 0;
            int end = n;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(guess(mid) == 0){
                    return mid;
                }
                if(guess(mid) == 1){
                    start = mid + 1;
                }if(guess(mid) == -1){
                    end = mid -1;
                }
            }
            return -1;


        }




    }
    public static void main(String[] args){
        int n = 10;

       int ans =  Solution.guessNumber(n);
        System.out.println(ans);

    }

    static public  int guess(int num){
        int pick = 4;
        if(pick == num){
            return 0;
        }
        if(pick < num){
            return -1;
        }
        if(pick > num){
            return 1;
        }
        return 101;

    }
}



// LeetCode 1342 : Number of Steps to Reduce a Number to Zero

package com.Recursion.Problems;
public class NumberOfSteps_1342 {

    static int numberOfSteps(int num) {

        return ans(num, 0);

    }

    static int ans(int num, int count){
        if(num <= 0){
            return count;
        }
        if(num%2==0){
            num= num/2;
        }
        else{
            num = num-1;
        }
        count++;
        return ans(num, count);
    }
    public static void main(String[] args){
        int num = 14;
        System.out.println(numberOfSteps(num));

    }
}

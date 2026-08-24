package com.Sorting.Problems;

import java.util.Arrays;

public class MissigNumber_268 {
    static  int missingNumber(int[] nums) {

        int n = nums.length;
        int c = 0;
        while(c < nums.length) {
            for (int i = 0; i < n-1; i++) {
                if(nums[i] > nums[i+1]){
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                    System.out.println(Arrays.toString(nums));
                }
            }
           if(nums[n-1] == n){
               n--;
               c++;
           }else{
               return n;
           }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}

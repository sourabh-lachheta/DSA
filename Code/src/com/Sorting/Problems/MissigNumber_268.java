package com.Sorting.Problems;

import java.util.Arrays;

public class MissigNumber_268 {
    static  int[] missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int c = nums[i];
             if( nums[i] < nums.length && nums[i] != nums[c]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {3,0,1};
        System.out.println(Arrays.toString(nums));
    }
}

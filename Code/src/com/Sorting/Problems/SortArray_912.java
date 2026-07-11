

// LeetCode 912 : sort array (using bubble sort for practice)

package com.Sorting.Problems;

import java.util.Arrays;
public class SortArray_912 {
    public static int[] sortArray(int[] nums) {
        for(int i = 0;  i < nums.length-1; i++){
            for(int j = 0; j < nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}

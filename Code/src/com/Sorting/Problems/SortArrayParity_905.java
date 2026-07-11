

// LeetCode 905: sort array parity


package com.Sorting.Problems;

import java.util.Arrays;
public class SortArrayParity_905 {

    public static int[] sortArrayByParity(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums.length-1-i; j++ ){
                if(nums[j]%2 !=0 && nums[j+1]%2 == 0 ){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,1,5,4,2};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }
}

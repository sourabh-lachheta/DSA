package com.Sorting.CycleSort;

import java.util.Arrays;
public class Main {
    static int[] sort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int c = nums[i] -1;
            if(nums[i] != c){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,5,4};
        System.out.println(Arrays.toString(sort(nums)));
    }
}

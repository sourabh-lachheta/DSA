package com.Sorting.CycleSort;

import java.util.Arrays;
public class Main {
    static int[] sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int c =  nums[i]-1;
            if( nums[i] != nums[c]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }else{
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}

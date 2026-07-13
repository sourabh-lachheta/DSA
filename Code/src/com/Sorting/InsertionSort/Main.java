package com.Sorting.InsertionSort;

import java.util.Arrays;
public class Main {
    static int[] sort(int[] nums){
        for(int i = 1; i < nums.length; i++ ){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && key < nums[j]){
                nums[j + 1]  = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }


    public static void main(String[] args){
        int[] nums = {4,1,3,2,5};
        System.out.println(Arrays.toString(sort(nums)));
    }
}

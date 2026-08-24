package com.Sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    static int[] sort(int[] nums){

        for(int i = 0; i < nums.length-1; i++){
            int min = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min] ){

                    min = j;
                }
            }
            int a = nums[i];
            nums[i] = nums[min];
            nums[min] = a;

        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,1,5,4,2};
        System.out.println(Arrays.toString(sort(nums)));

    }
}

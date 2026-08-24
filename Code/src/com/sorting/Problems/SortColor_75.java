

// LeetCode 75: sort Color (using selection sort)

package com.Sorting.Problems;

import java.util.Arrays;
public class SortColor_75 {
    public static  void sortColors(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            int min = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] main){
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);

    }
}

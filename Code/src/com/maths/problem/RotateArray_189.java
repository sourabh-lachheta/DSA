package com.maths.problem;

public class RotateArray_189 {
    public static void rotate(int[] nums, int k) {

        k = k % nums.length;


        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k , nums.length-1 );


    }


    public static int[] reverse(int[] nums, int left, int right){

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        return nums;

    }
}

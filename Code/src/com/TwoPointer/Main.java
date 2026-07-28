package com.TwoPointer;

import java.util.Arrays;

public class Main {

    private static int[] two_pointer(int[] nums, int target, int left, int right){
        if(left < right){
            if(nums[left] + nums[right] == target){
                return new int[] {left, right};
            }
            if(nums[left] + nums[right] > target){
                return two_pointer(nums, target, left, right-1);
            }else{
                return two_pointer(nums, target, left+1, right);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){

        int[] nums = {2,3,5,6,7,8};
        int target = 5;
        System.out.println(Arrays.toString(two_pointer(nums, target,0,nums.length-1)));


    }
}

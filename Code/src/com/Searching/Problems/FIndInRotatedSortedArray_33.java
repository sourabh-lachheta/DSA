package com.Searching.Problems;

public class FIndInRotatedSortedArray_33 {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                System.out.println("start"+nums[start]);
                start = mid + 1;
            }
            else{
                System.out.println("end"+nums[end]);
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));


    }
}



// binary search using recursion LeetCode 704;

package com.Searching.BinarySearch;

public class BinarySearchRecursive {
    static  int search(int[] nums, int target) {
        int ans = binarySearch(nums, target, 0, nums.length-1);
        return ans;
    }
    static int binarySearch(int[] nums,int target, int start, int end){
        if(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                return binarySearch(nums, target, mid +1, end);
            }

            if(target < nums[mid]){
                return binarySearch(nums, target, start,mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
}

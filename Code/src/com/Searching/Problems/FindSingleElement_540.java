

// LeetCode 540: find single element

package com.Searching.Problems;
public class FindSingleElement_540 {
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
             int mid = start + (end - start)/2;
             if(end == mid){
                 return nums[mid];
             }
            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]){
                    start = mid + 2;
                }else{
                    end = mid;
                }
            }if(mid%2 != 0){
                if( nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }}}
      return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4,7,7};
        System.out.println(singleNonDuplicate(nums));

    }
}

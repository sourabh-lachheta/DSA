package com.Bitwise;

public class SingleNumber_136 {

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
          //  System.out.println(nums[i]);
            ans |= nums[i];

           // System.out.println(ans);
        }
        System.out.println(" ");
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {4,1,2,1,1,2,2};
        System.out.println(singleNumber(nums));
    }
}

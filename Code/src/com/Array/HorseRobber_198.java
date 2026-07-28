

// hold...


package com.Array;

import java.util.Arrays;

public class HorseRobber_198 {
    static int rob(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
       int  sum = temp[temp.length-1];
        for(int i = temp.length-2; i >=0; i--){

        }
        return 0;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));

    }
}

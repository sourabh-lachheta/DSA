package com.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmostMissingInteger_3471 {

    private static int largestInteger(int[] nums, int k) {

        int max = -1;

        for (int num : nums) {

            int windowCount = 0;

            for (int start = 0; start <= nums.length - k; start++) {

                boolean found = false;

                for (int j = start; j < start + k; j++) {

                    if (nums[j] == num) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    windowCount++;
                }
            }

            if (windowCount == 1) {
                max = Math.max(max, num);
            }
        }

        return max;
    }
    public static void main(String[] args){

        int[] nums = {3,9,7,2,1,7};
        System.out.println(largestInteger(nums, 4));


    }
}

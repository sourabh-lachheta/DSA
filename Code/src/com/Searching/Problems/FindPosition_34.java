

// LeetCode 34 : find position

package com.Searching.Problems;

import java.util.Arrays;

public class FindPosition_34 {
    public static int[] searchRange(int[] nums, int target) {
        int first = Search(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = Search(nums, target, false);
        return new int[]{first, last};
    }
     static int Search(int[] nums, int target, boolean Find) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (Find) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}



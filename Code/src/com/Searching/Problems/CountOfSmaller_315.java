package com.Searching.Problems;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmaller_315 {

    static List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int start = 0;
        while(start < nums.length-1 ) {
            int count = 0;
            for (int i = start + 1; i < nums.length; i++) {
                if (nums[start] > nums[i]) {
                    count++;
                }
            }
            list.add(count);
            start++;

        }
        list.add(0);
        return list;

    }
    public static void main(String[] args){
        int[] nums = {-1};
        System.out.println(countSmaller(nums));

    }
}

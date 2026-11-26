package com.maths.problem;

import java.util.HashSet;
import java.util.Set;

public class SneakyNumber_3289 {
    public static int[] getSneakyNumbers(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        int[] arr = new int[2];
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if(sets.contains(nums[i])){
                arr[n] = nums[i];
                n++;
                if(n == 2){
                    return arr;
                }
            }else{
                sets.add(nums[i]);
            }
        }

        return arr;
    }
    public static void main(String[] args){
        int[] nums = {0,1,1,0};
        System.out.println(getSneakyNumbers(nums));
    }
}



// LeetCode 1051: height Checker


package com.Sorting.Problems;

public class HeightChecker_1051 {
    public static int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        int count = 0;
        int n = heights.length-1;
        for(int i = 0; i < heights.length-1; i++){
            for(int j = 0; j < heights.length-1-i; j++){
                if(heights[j] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < heights.length; i++){
            if(sorted[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));

    }
}

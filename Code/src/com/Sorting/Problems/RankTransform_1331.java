

// hold for now......

package com.Sorting.Problems;
import java.util.Arrays;
public class RankTransform_1331 {

    public static  int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        return sorted;


    }
    public static void main(String[] args){
        int[] nums = {10,30,20};
        System.out.println(Arrays.toString(arrayRankTransform(nums)));
    }
}



// hold for now......

package com.Sorting.Problems;
import java.util.Arrays;
public class RankTransform_1331 {

    public static  int[] arrayRankTransform(int[] arr) {
        int[] arr2 =new int[arr.length];
        int m = Integer.MIN_VALUE;
        int rank = 1;
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j] ){
                    min = j;
                }
            }
            if(m != arr[min] && i > 0){
                rank++;
            }
            m = arr[min];
            //System.out.println(rank);
            int n = min;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            arr2[n] = rank;
           // rank++;
           // System.out.println("second" +rank);
        }
        arr2[arr.length-1] = rank;
         return arr2;
    }
    public static void main(String[] args){
        int[] nums = {10,10,10};
        System.out.println(Arrays.toString(arrayRankTransform(nums)));
    }
}

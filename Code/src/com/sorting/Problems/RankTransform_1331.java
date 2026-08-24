

// LeetCode 1331

package com.Sorting.Problems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform_1331 {

    public static  int[] arrayRankTransform(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = mergeSort(arr);

        int rank = 1;

        for(int i = 0; i < ans.length; i++){

            if(!map.containsKey(ans[i])){
                map.put(ans[i], rank);
                rank++;
            }
        }

        // original array -> rank
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;



    }

    private static int[] mergeSort(int[] arr){

        if( arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right );
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }

            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args){
        int[] nums = {10,30,20};
        System.out.println(Arrays.toString(arrayRankTransform(nums)));
    }
}

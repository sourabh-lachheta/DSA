package com.sorting.Problems;

public class MedianOfTwoSortedArray_4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result = 0;

        int[] ans = merge(nums1, nums2);

        int mid = ans.length/2;

        //  System.out.println(Arrays.toString(ans));

        if(ans.length%2 == 0){
            // System.out.print(mid);
            result = (ans[mid-1] + ans[mid])/2.0;

            //System.out.print(ans[mid] + " " + ans[mid +1] );
            return result;
        }else{


            return ans[mid];

        }

    }

    public static int[] merge(int[] first, int[] second){

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
        int[] nums1 = {1,2};
        int[] nums2 = {3};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}

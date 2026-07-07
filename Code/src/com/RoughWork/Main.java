package com.RoughWork;

public class Main {
    static class Solution {
        public static int removeCoveredIntervals(int[][] intervals) {
            int i = 0;
            int l = intervals.length;
            while(i < intervals.length - 1) {
                int n = 0;
                while (n <= 1) {
                    //System.out.println(l);
                    if (intervals[i][n] >= intervals[i + 1][n] && intervals[i][n + 1] <= intervals[i + 1][n + 1]) {
                        l--;
                    }
                    n++;
                }
                i++;
            }
            return l;

        }
    }


    public static void main(String[] args){
        int[][] arr = {{1,4},{3,6},{2,8}};
        System.out.println(Solution.removeCoveredIntervals(arr));


    }
}



package com.Problems;




public class BadVersion_278 {


    public  class VersionControl{
        public static boolean isBadVersion(int version) {
           int n = 3; // bad version
            if(version == n){
                return true;
            }else{
                return false;
            }
        }
    }
    public class Solution extends VersionControl {
        public static  int firstBadVersion(int n) {
            int start = 1;
            int end = n;

                while (start < end) {
                    int mid = start + (end - start) / 2;
                    if (isBadVersion(mid) == true) {
                            end = mid;
                    } else {
                            start = mid + 1;

                    }
                }
                return end;
            }
        }
    public static void main(String[] args){
        int n = 5;
        System.out.println(Solution.firstBadVersion(n));
    }
}



// not correct yet


package com.String.Problems;

public class LongestPalindrome_5 {
    static String longestPalindrome(String s) {
        return solve(s,0,s.length()-1);
    }
    static String solve(String s, int left, int right){
        if(left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                int l = left;
                int r = right;
                while (l < r) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r--;
                    } else {
                        break;
                    }
                    return s;
                }
            } else {
                return solve(s, left + 1, right - 1);
            }
        }
        System.out.println("this");
        return s;
    }
    public static void main(String[] args){
        String s = "babbad";
        System.out.println(longestPalindrome(s));
    }
}

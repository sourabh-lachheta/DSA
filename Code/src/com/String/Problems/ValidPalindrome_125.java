

// LeetCode 125 : Valid Palindrome


package com.String.Problems;

public class ValidPalindrome_125 {
    static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >='a' && s.charAt(i) <= 'z' ||  s.charAt(i) >= '0' && s.charAt(i) <= '9' ){
                str.append(s.charAt(i));
            }
        }

        int start= 0;
        int end = str.length()-1;
        boolean ans = true;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                ans = true;
            }else{
                return false;
            }

            start++;
            end--;

        }


        System.out.println(str);
        return ans;

    }

    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));


    }
}

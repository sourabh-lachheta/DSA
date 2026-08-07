package com.maths;

public class NoOfDigits {
    public static void main(String[] args){
        int num = 10;
        int base = 10; // base is 10 , it gives number of digit in number. base 2, it gives number of binary digits in number

        int ans = (int) (Math.log(num) / Math.log(base)) +1;
        System.out.println(ans);
    }
}

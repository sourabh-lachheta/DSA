package com.Random;

public class GCD_3658 {
    static int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int num =0;
        for(int i = 1; i <= n; i++){
            sumEven = sumEven + i*2;
            System.out.println("even : "+sumEven);
            sumOdd = sumOdd + i + num;
            System.out.println("odd : "+sumOdd);
            num++;
        }
        int gcd = sumEven%sumOdd;
        return gcd;
    }


    public static void main(String[] args){
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }
}

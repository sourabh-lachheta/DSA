package com.Bitwise;



public class EvenOdd {
    public static void main(String[] args){
        int num = 53;
        System.out.println(isOdd(num));
    }

     private static Boolean isOdd(int num){
        return (num & 1) == 1;

    }
}

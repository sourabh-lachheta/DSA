package com.Bitwise;

public class ShiftOperator {
    public static void main(String[] args){
        int num = 17;
       // num = num >> 1;
       // System.out.println(num);

        num =  num & (1 << 4);
        System.out.println(num);
    }
}

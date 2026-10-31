package com.maths.problem;

import java.sql.SQLOutput;

public class Base7_504 {
    public static String convertToBase7(int num) {

        if(num == 0){
            return "0";
        }

        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();


        while(num > 0){
            int a = num%7;
            sb.append(a);
            num = num/7;

        }

        if(negative){
            sb.append("-");
        }

        return sb.reverse().toString();

    }


    public static void main(String[] args){

        System.out.println(convertToBase7(100));

    }
}

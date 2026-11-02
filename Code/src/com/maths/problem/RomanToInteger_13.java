package com.maths.problem;

public class RomanToInteger_13 {
    public static int romanToInt(String s) {


        int temp =  getValue(s.charAt(s.length()-1));
        int ans = temp;


        for(int i = s.length()-2; i>=0; i--){

            int current = getValue(s.charAt(i));

            if(temp > current){
                ans = ans - current;
            }else{
                ans = ans + current;
            }

            temp = current;

        }

        return ans;

    }

    public static int getValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }


    public static void main(String[] args){
        String s = "III";
        System.out.println(romanToInt(s));
    }
}

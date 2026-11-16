package com.Random;

public class StringSum_2243 {
    public static  String digitSum(String s, int k) {



        while(s.length() > k){
            s = solve(s, k);
        }

        return s;



    }

    private static String solve(String s, int k){

        StringBuilder current = new StringBuilder();
        StringBuilder str = new StringBuilder();

        int n = 0;

        for(int i = 0; i< s.length(); i++){

            n++;
            current.append(s.charAt(i));

            if(n == k){
                str.append(sum(current.toString()));
                current.setLength(0);

                // current = "";
                n=0;
            }

        }

        if(!current.isEmpty()){
            // str = str + sum(current);
            str.append(sum(current.toString()));
        }

        return str.toString();

    }

    private static String sum(String s){

        int sum  = 0;

        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }

        return String.valueOf(sum);
    }

    public static void main(String[] args){
        String str = "111222333444";
        int k = 3;
        System.out.println(digitSum(str,k));
    }
}

package com.String.Problems;

public class Check_A_B_2124 {
    public static boolean checkString(String s) {


        if(check_for_b(s) == s.length() || check_for_a(s) == 0){
            return true;
        }

        if(check_for_b(s) < check_for_a(s)){
            return false;
        }

        return true;

    }

    public static int check_for_b(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                return i;
            }
        }

        return s.length();
    }

    public static int check_for_a(String s){
        for(int i = s.length()-1; i>= 0; i--){
            if(s.charAt(i) == 'a'){
                return i;
            }
        }

        return 0;
    }


    public static void main(String[] args){
        String s = "aaabbb";
        System.out.println(checkString(s));
    }
}

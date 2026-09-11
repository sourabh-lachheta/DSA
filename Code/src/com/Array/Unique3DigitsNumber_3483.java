package com.Array;

import java.util.HashSet;

public class Unique3DigitsNumber_3483 {

    public static int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < digits.length; i++){

            // hundreds digit cannot be 0
            if(digits[i] == 0){
                continue;
            }

            for(int j = 0; j < digits.length; j++){

                if(j != i){

                    for(int k = 0; k < digits.length; k++){

                        if(k != i && k != j){

                            int ans = digits[i] * 100
                                    + digits[j] * 10
                                    + digits[k];

                            if(ans % 2 == 0){
                                set.add(ans);
                            }
                        }
                    }
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args){
        int[] digits = {1,2,3,4};
        System.out.println(totalNumbers(digits));
    }
}

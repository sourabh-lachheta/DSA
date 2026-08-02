

// LeetCode 877: Stone Game

package com.Random;

public class StoneGame_877 {

    private static boolean stoneGame(int[] piles) {
        return true;

        /*
        if alice choose first then alice check sum of even
        and odd example = [1,2,3,2,1,2].
        evenSum = 1+3+1 = 5, oddSum = 2+2+2 = 6,
        then alice say "i m going to choose odd index every time"
        with this if alice choose first she Knows which is greater,
        so alice always win!!
        */
    }
    public static void main(String[] args){
        int[] piles = {1,2,3,2,1,2};
        System.out.println(stoneGame(piles));

    }
}

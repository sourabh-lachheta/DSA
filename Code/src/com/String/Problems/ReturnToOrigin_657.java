

// LeetCode 657: Robot Return To Origin

package com.String.Problems;

public class ReturnToOrigin_657 {
    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                y++;
            }
            if(moves.charAt(i) == 'R'){
                y--;
            }
            if(moves.charAt(i) == 'U'){
                x++;
            }
            if(moves.charAt(i) == 'D'){
                x--;
            }
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args){
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
}

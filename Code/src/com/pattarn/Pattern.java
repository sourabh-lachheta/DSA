package com.pattarn;

public class Pattern {
    private static void solve(int col, int row){

        for(int i = 0; i < col; i++){
            for(int j = 0; j < col - i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }

    private static void solveR(int col, int row){

        if(row < 0){
            return;
        }

        if(col < row){
            System.out.print(" * ");
            solveR(col+1, row);

        }else{
            System.out.println();
            solveR(0,row-1);
        }
    }

    public static void main(String[] args){
        solveR(0,4);
    }
}

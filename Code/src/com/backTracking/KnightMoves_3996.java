package com.backTracking;

public class KnightMoves_3996 {

/*
    public static  boolean canReach(int[] start, int[] target) {




    }


    private static boolean solve(int row, int col, int[] target, int count , int[][] board){


    }*/





    private static boolean canMove(int row, int col,  int[][] board){


        if(isValid(row+2,col+1,board)){
            return true;
        }

        if(isValid(row+2,col-1,board)){
            return true;
        }

        if(isValid(row+1,col+2,board)){
            return true;
        }

        if(isValid(row-1,col+2,board)){
            return true;
        }

        if(isValid(row+1,col-2,board)){
            return true;
        }

        if(isValid(row-1,col-2,board)){
            return true;
        }

        if(isValid(row-2,col+1,board)){
            return true;
        }

        if(isValid(row-2,col-1,board)){
            return true;
        }


        return false;
    }

    static boolean isValid(int row, int col, int[][] board){
        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length){
            return true;
        }else{
            return false;
        }
    }





        public static void main(String[] args){
        int[] start = {1,1};
        int[] target = {2,2};

       // System.out.println(canReach(start, target));

    }
}

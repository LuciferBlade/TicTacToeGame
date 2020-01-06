/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

/**
 *
 * @author blade
 */
public class TicTacToe {

    public int[][] board;

    public TicTacToe(int boardSize) {
        board = new int[boardSize][boardSize];
        resetBoard();
    }
    
    public int getSize(){
        return board.length;
    }

    public boolean checkFullBoard(int[][] board) {
        boolean temp = false;
        for (int[] board1 : board) {
            for (int j = 0; j < board.length; j++) {
                if (board1[j] == 0) {
                    temp = true;
                }
            }
        }
        return temp;
    }

    public boolean checkDiagonal(int[][] board, int sign) {
        String temp = "";
        //diagonal from left top to right bottom check
        for (int i = 0; i < board.length; i++) {
            temp = temp + String.valueOf(board[i][i]);
            //System.out.print(temp + "\n");
        }
        return temp.matches("^[" + String.valueOf(sign) + "]+$");
    }

    public boolean checkRevDiagonal(int[][] board, int sign) {
        String temp = "";
        //diagonal from right top to left bottom check
        for (int i = 0; i < board.length; i++) {
            temp = temp + String.valueOf(board[i][board.length - (i + 1)]);
            //System.out.print(temp + "\n");
        }
        return temp.matches("^[" + String.valueOf(sign) + "]+$");
    }

    public boolean checkHorizontal(int i, int[][] board, int sign) {
        String temp = "";
        for (int j = 0; j < board.length; j++) {
            temp = temp + String.valueOf(board[i][j]);
        }
        return temp.matches("^[" + String.valueOf(sign) + "]+$");
    }

    public boolean checkVertical(int i, int[][] board, int sign) {
        String temp = "";
        for (int[] board1 : board) {
            temp = temp + String.valueOf(board1[i]);
        }
        return temp.matches("^[" + String.valueOf(sign) + "]+$");
    }

    public String check(int sign) {
        //diagonal from left top to right bottom check
        if (checkDiagonal(board, sign)) {
            return "\\ 0 0";
        }
        //diagonal from right top to left bottom check
        if (checkRevDiagonal(board, sign)) {
            return "/ 0 " + String.valueOf(board.length - 1);
        }

        //all horizontal line check
        for (int i = 0; i < board.length; i++) {
            if (checkHorizontal(i, board, sign)) {
                return "- " + String.valueOf(i) + " " + String.valueOf(0);
            }
        }

        //all vertical line check
        for (int i = 0; i < board.length; i++) {
            if (checkVertical(i, board, sign)) {
                return "| " + String.valueOf(0) + " " + String.valueOf(i);
            }
        }

        //checking if board is totally full
        if (!checkFullBoard(board)) {
            return "Tie";
        }

        return "Not won";
    }

    public boolean safeChangeTile(int sign, int x, int y) {
        if (board[x][y] == 0) {
            board[x][y] = sign;
            return true;
        } else {
            return false;
        }
    }

    public int getTile(int x, int y) {
        return board[x][y];
    }

    public void setTile(int value, int x, int y) {
        board[x][y] = value;
    }

    public void resetBoard() {
        for (int[] board1 : board) {
            for (int j = 0; j < board.length; j++) {
                board1[j] = 0;
            }
        }
    }
}

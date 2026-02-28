package Backtracking;

import java.util.Scanner;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=9;
        int[][] board=new int[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
            	board[i][j]=sc.nextInt();
    		}
        }
        solveSudoku(board);
        // Print solved Sudoku
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

	}
	public static void solveSudoku(int[][] board) {
        helper(board, 0, 0);
    }
	public static boolean helper(int[][] board, int row, int col) {

        // If we reach past last row → solved
        if (row == 9) {
            return true;
        }

        int nrow, ncol;

        // Move to next cell
        if (col != 8) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // If already filled, move ahead
        if (board[row][col] != 0) {
            return helper(board, nrow, ncol);
        }

        // Try placing numbers 1–9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (helper(board, nrow, ncol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = 0;
            }
        }

        return false;
    }
	public static boolean isSafe(int[][] board, int row, int col, int num) {

        // Row & column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
            if (board[row][i] == num) return false;
        }

        // 3×3 subgrid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

}

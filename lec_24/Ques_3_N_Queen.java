package lec_24;

import java.util.Scanner;

public class Ques_3_N_Queen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		solveNQueens(board, n, 0);
		
	}

	public static void solveNQueens(boolean[][] board, int tq, int r) {
		if (tq == 0) {
			display(board);
			System.out.println();
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (isItPossible(board, r, i)) {
				board[r][i] = true;
				solveNQueens(board, tq - 1, r + 1);
				board[r][i] = false;

			}
		}
	}

	private static boolean isItPossible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		// left diagonal checking
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal checking
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}

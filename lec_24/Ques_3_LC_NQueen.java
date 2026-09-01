package lec_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques_3_LC_NQueen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<List<String>> ans = new ArrayList<List<String>>();

		char[][] board = new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = '.';
			}
		}

		solveNQueens(board, n, 0, ans);
		System.out.println(ans);

	}

	public static void solveNQueens(char[][] board, int tq, int r, List<List<String>> ans) {
		if (tq == 0) {
			ans.add(helper(board));
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (isItPossible(board, r, i)) {
				board[r][i] = 'Q';
				solveNQueens(board, tq - 1, r + 1, ans);
				board[r][i] = '.';

			}
		}
	}

	private static List<String> helper(char[][] board) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < board.length; i++) {
			StringBuilder str = new StringBuilder();
			for (int j = 0; j < board[0].length; j++) {
				str.append(board[i][j]);
			}
			list.add(str.toString());
		}
		return list;
	}

	private static boolean isItPossible(char[][] board, int row, int col) {
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col] == 'Q') {
				return false;
			}
			r--;
		}
		// left diagonal checking
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == 'Q') {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal checking
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == 'Q') {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}

package lec_23;

public class Ques_1_Queen_Permutatoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] borad = new boolean[n];
		int queen = 2;
		permutation(borad, queen, "", 0);
	}

	public static void permutation(boolean[] board, int tq, String ans, int qpsf) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (!board[i]) {
				board[i] = true;
				permutation(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1); // qpsf = queen placed so far
				board[i] = false; // UNDO - backtracking
			}
		}
	}

}

package lec_25;

public class Ques_1_Sudoko_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		solve(grid, 0, 0);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean solve(int[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			return true;
		}
		if (grid[row][col] != 0) {
			return solve(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isItSafe(grid, row, col, val)) {
					grid[row][col] = val;
					boolean ans = solve(grid, row, col + 1);
					if (ans) {
						return true;
					}
					grid[row][col] = 0;
				}
			}
		}
		return false;

	}

	private static boolean isItSafe(int[][] grid, int row, int col, int val) {
		// row checking
		for (int i = 0; i < grid[0].length; i++) {
			if (grid[row][i] == val) {
				return false;
			}
		}
		// col checking
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col] == val) {
				return false;
			}
		}
//		 3X3 matrix checking
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}

}

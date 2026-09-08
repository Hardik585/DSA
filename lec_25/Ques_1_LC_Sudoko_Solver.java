package lec_25;

public class Ques_1_LC_Sudoko_Solver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solve(grid, 0, 0);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean solve(char[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			return true;
		}
		if (grid[row][col] != '.') {
			return solve(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isItSafe(grid, row, col, val)) {
					grid[row][col] = (char) (val + '0');
					boolean ans = solve(grid, row, col + 1);
					if (ans) {
						return true;
					}
					grid[row][col] = '.';
				}
			}
		}
		return false;

	}

	private static boolean isItSafe(char[][] grid, int row, int col, int val) {
		// row checking
		for (int i = 0; i < grid[0].length; i++) {
			if (grid[row][i] - '0' == val) {
				return false;
			}
		}
		// col checking
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col] - '0' == val) {
				return false;
			}
		}
//		 3X3 matrix checking
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] - '0' == val) {
					return false;
				}
			}
		}
		return true;
	}

}

package Lecture19;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];

		placeQueens(board, 0, n);
	}

	private static void placeQueens(boolean[][] board, int row, int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			display(board);
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				placeQueens(board, row + 1, n - 1);
				board[row][col] = false;
			}

		}

	}

	private static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int r = row;
		int c = col;
		
		// same col
		while (r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
		}

		// Left Diagonal
		r = row;
		c = col;

		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}

		// Right Diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	private static void display(boolean[][] board) {
		// TODO Auto-generated method stub

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

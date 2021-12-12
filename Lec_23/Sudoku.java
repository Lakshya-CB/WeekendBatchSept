package Lec_23;

import java.util.Scanner;

public class Sudoku {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] board = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = sc.nextInt();
			}
		}
//		disp(board);
		sud(0, 0, board);
	}

	public static void sud(int r, int c, int[][] board) {

		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			disp(board);
			return;
		}

		if (board[r][c] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(board, r, c, i)) {
					board[r][c] = i;
					sud(r, c + 1, board);
//				Back Tracking?!?!
					board[r][c] = 0;
				}
			}
		} else {
			sud(r, c + 1, board);
		}
	}

	public static boolean isSafe(int[][] board, int r, int c, int ele) {
//check row
		for (int col = 0; col < 9; col++) {
			if (board[r][col] == ele) {
				return false;
			}
		}
//		check each col
		for(int row=0;row<9;row++) {
			if (board[row][c] == ele) {
				return false;
			}	
		}
		
		int box_r = r/3;
		int box_c = c/3;
		for(int row=box_r*3;row<box_r*3+3; row++) {
				
			for(int col=box_c*3;col<box_c*3+3; col++) {
				if (board[row][col] == ele) {
					return false;
				}
			}
		}
		
		
		return true;

	}

	public static void disp(int[][] board) {
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				for (int j = 0; j < 9; j++) {
					System.out.print("==");
				}
				System.out.println();
			}

			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0 && j > 0) {
					System.out.print("||");
				}
				System.out.print(board[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

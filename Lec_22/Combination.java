package Lec_22;

public class Combination {
	public static void main(String[] args) {
//		comb_box(0, -1, 3, 4, "");  
		// -1 because last_pos +1 should start with 0 for the first slected box or queen
//		perm_box(0, 2, "", new boolean[3]);
//		comb_wrt_box(0, 0, 2, 4, "");
//		comb_wrt_box_2D(0, 0, 0, 2, 2, 2, "");
		comb_wrt_box_2D_Kill(0, 0, 0, 2, 3, 3, "", new boolean[3][3]);
	}

	public static void comb_box(int curr_Q, int last_pos, int total_Q, int total_seats, String ans) {
//	+ve BC ?
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}
		for (int i = last_pos + 1; i < total_seats; i++) {
//			Select one box!!, or Select one Queen seat!!
			comb_box(curr_Q + 1, i, total_Q, total_seats, ans + "b" + i + " , ");
		}
	}

	public static void perm_box(int curr_Q, int total_Q, String ans, boolean[] seats_isFilled) {
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < seats_isFilled.length; i++) {
			if (!seats_isFilled[i]) {
				seats_isFilled[i] = true;
				perm_box(curr_Q + 1, total_Q, ans + "b" + i + " , ", seats_isFilled);
				seats_isFilled[i] = false;
			}
		}
	}

	public static void comb_wrt_box(int curr_Q, int idx, int total_Q, int col, String ans) {
//		 +ve BC
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}

//		-ve BC
		if (idx == col) {
			return;
		}

//		Place queen at idx!!
		comb_wrt_box(curr_Q + 1, idx + 1, total_Q, col, ans + "Q" + idx + " , ");
//		Not placed 
		comb_wrt_box(curr_Q, idx + 1, total_Q, col, ans);
	}

	public static void comb_wrt_box_2D(int curr_Q, int idx_row, int idx_col, int total_Q, int row, int col,
			String ans) {
//		 +ve BC
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}

//		agar mein idx_col== col , then move to next row!!
		if (idx_col == col) {
			idx_row++;
			idx_col = 0;
//			return; nahi karna return!!
		}
//		-ve BC
		if (idx_row == row) {
			return;
		}

//		Place queen at idx!!
		comb_wrt_box_2D(curr_Q + 1, idx_row, idx_col + 1, total_Q, row, col,
				ans + "Q{" + idx_row + "," + idx_col + "} , ");
		// Not placed
		comb_wrt_box_2D(curr_Q, idx_row, idx_col + 1, total_Q, row, col, ans);
	}

	public static void comb_wrt_box_2D_Kill(int curr_Q, int idx_row, int idx_col, int total_Q, int row, int col,
			String ans, boolean[][] board) {
//		 +ve BC
		if (curr_Q == total_Q) {
			System.out.println(ans);
			return;
		}

//		agar mein idx_col== col , then move to next row!!
		if (idx_col == col) {
			idx_row++;
			idx_col = 0;
//			return; nahi karna return!!
		}
//		-ve BC
		if (idx_row == row) {
			return;
		}
		if (isSafe(board, idx_row, idx_col)) {
			board[idx_row][idx_col] = true;
//		Place queen at idx!!
			comb_wrt_box_2D_Kill(curr_Q + 1, idx_row, idx_col + 1, total_Q, row, col,
					ans + "Q{" + idx_row + "," + idx_col + "} , ",board);
			board[idx_row][idx_col] = false;
		}
		// Not placed
		comb_wrt_box_2D_Kill(curr_Q, idx_row, idx_col + 1, total_Q, row, col, ans,board);
	}

	private static boolean isSafe(boolean[][] board, int idx_row, int idx_col) {
		// TODO Auto-generated method stub
//		Uper
		for(int r = 0;r<=idx_row;r++) {
			if(board[r][idx_col]) {
				return false;
			}
		}
//		Left!!
		for(int c=0;c<=idx_col;c++) {
			if(board[idx_row][c]) {
				return false;
			}
		}
//		D1
		int r1 = idx_row;
		int c1 = idx_col;
		while(r1>=0&& c1<board[0].length) {
			if(board[r1][c1]) {
				return false;	
			}
			r1--;
			c1++;
		}
//		D2
		int r2 = idx_row;
		int c2 = idx_col;
		while(r2>=0&& c2>=0) {
			if(board[r2][c2]) {
				return false;	
			}
			r2--;
			c2--;
		}
		return true;
	}

}

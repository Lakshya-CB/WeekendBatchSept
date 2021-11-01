package Lec_12;

public class Search_2D_sorted {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		int ele = 29;

		int r = 0;
		int c = arr[0].length - 1;

		while (r < arr.length && c >= 0) {
			if (arr[r][c] == ele) {
				System.out.println(r + " " + c);
				return;
			} else if (arr[r][c] > ele) {
				c--;
			} else {
				r++;
			}
		}
		System.out.println(-1);
	}
}

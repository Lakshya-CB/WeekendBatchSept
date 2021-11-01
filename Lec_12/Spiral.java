package Lec_12;

public class Spiral {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 ,15}, 
						{ 21, 22, 23, 24 ,25}, 
						{ 31, 32, 33, 34 ,35}, 
						};

		int min_row = 0;
		int min_col = 0;

		int max_row = arr.length - 1;
		int max_col = arr[0].length - 1;

		int count = 0;

		while (max_col >= min_col && max_row >= min_row ) {
			for (int curr_r = min_row; curr_r <= max_row && count < arr.length * arr[0].length; curr_r++) {
				System.out.print(arr[curr_r][min_col] + " ");
				count++;
			}
			System.out.println("++");

			for (int curr_c = min_col + 1; curr_c <= max_col && count < arr.length * arr[0].length; curr_c++) {
				System.out.print(arr[max_row][curr_c] + " ");
				count++;
			}
			System.out.println("++");

			for (int curr_r = max_row - 1; curr_r >= min_row && count < arr.length * arr[0].length; curr_r--) {
				System.out.print(arr[curr_r][max_col] + " ");
				count++;
			}
			System.out.println("++");
			System.out.println("=== Count"+count);
			for (int curr_c = max_col - 1; curr_c >= min_col + 1 && count < arr.length * arr[0].length; curr_c--) {
				System.out.print(arr[min_row][curr_c] + " ");
				count++;
			}
			System.out.println("++");

			System.out.println("-------------");
			min_col++;
			min_row++;

			max_col--;
			max_row--;

		}
	}
}

package Lec_12;

public class wave_display {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 ,15},
						{ 21, 22, 23, 24 ,25}, 
						{ 31, 32, 33, 34 ,35}, 
						{ 41, 42, 43, 44 ,45} };
		for(int col = 0;col<arr[0].length;col++) {
			for(int row=0;row<arr.length;row++) {
				int row_tp = row;
				if(col%2==1) {
					row_tp = arr.length-row-1;
				}
				
				System.out.print(arr[row_tp][col]+" ");
			}
			System.out.println();
		}

	}
}

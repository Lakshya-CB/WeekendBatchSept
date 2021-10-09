package Lec_6;

public class Pat_13 {
	public static void main(String[] args) {
		int n = 7	;
		int row = 1;
		int num_star = 1;
		while (row <= 2 * n - 1) {
			int star = 1;
			while (star <= num_star) {
				System.out.print("* ");
				star++;
			}

//			Prep for line
			row++;
			if (row <= n) {
				num_star++;
			} else {
				num_star--;
			}
			System.out.println(" ");
		}
	}
}

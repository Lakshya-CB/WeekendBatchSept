package Lec_5;

public class Pat_6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int num_space = 0;
		int num_star = n;
		while (row <= n) {
			int space = 1;
			while (space <= num_space) {
				System.out.print("  ");
				space++;
			}
			int star = 1;
			while (star <= num_star) {
				System.out.print("* ");
				star++;
			}
			
			row++;
			num_space=num_space+2;
			num_star--;
			System.out.println();
		}
	}
}

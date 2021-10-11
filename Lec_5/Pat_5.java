package Lec_5;

public class Pat_5 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int num_L = 0;
		int num_star = n;
		while (row <= n) {
			int star = 1;
			while (star <= num_star) {
				System.out.print("* ");
				star++;
			}
// Most useless thing. Printing space after you have printed the row
			
			int L = 1;
			while (L <= num_L) {
				System.out.print("  ");
				L++;
			}
			
			row++;
			num_L++;
			num_star--;
			System.out.println();
		}
	}
}

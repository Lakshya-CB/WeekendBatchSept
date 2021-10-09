package Lec_6;

public class Pat_15 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int num_star = n;
		int num_space = 0;
		while (row <= 2 * n - 1) {
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
//			Prep
			row++;
			if(row>=n+1) {
				num_space=num_space-2;
				num_star ++;	
			}
			else{
				num_space=num_space+2;
			num_star --;
			}
			System.out.println();
		}
	}
}

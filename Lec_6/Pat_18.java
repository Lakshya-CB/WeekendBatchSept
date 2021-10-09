package Lec_6;

public class Pat_18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int num_star = 1;
		int num_space = n/2;
		while (row <= n) {
			int space = 1;
			while (space <= num_space) {
				System.out.print("  ");
				space++;
			}

			int star = 1;
			while (star <= num_star) {
				if(star==1||star==num_star) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
				star++;
			}
			row++;
			
			if(row>=n/2+2) {
				num_space++;
				num_star=num_star-2;
				
			}
			else{
				num_space--;
				num_star=num_star+2;
			}
			System.out.println();
		}
	}
}

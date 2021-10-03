package Lec_5;

public class Pat_7 {
	public static void main(String[] args) {
		int n = 7;
		int row  =1 ;
		while(row<=n) {
			int star = 1;
			while(star<=n) {
				if(star==row || star+row == n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				star ++;
			}
			row++;
			System.out.println();
		}	
	}
}

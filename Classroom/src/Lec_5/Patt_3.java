package Lec_5;

public class Patt_3 {
	public static void main(String[] args) {
		 int n = 5;
		 int row =1;
		 int num_star = n;
		 while(row<=n) {
			 int star = 1;
			 while(star<=num_star) {
				 System.out.print("* ");
				 star++;
			 }
			 row++;
			 num_star=num_star-1;
			 System.out.println();
		 }
	}
}

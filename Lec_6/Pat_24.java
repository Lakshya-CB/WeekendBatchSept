package Lec_6;

import java.util.Scanner;

public class Pat_24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 5;
		int row = 1;
		int num_space = n - 1;
		int num_star = 1;
		int ntp = 1;
		while (row <= n) {
			ntp=1;
			int space = 1;
			while (space <= num_space) {
				System.out.print("\t");
				space++;
			}

			int star = 1;
			while (star <= num_star) {
				System.out.print(ntp+"\t");
				if(star>=row) {
					ntp--;
				}
				else {
					ntp++;

				}
				star++;
			}
//			
			row++;
			num_star = num_star + 2;
			num_space--;
			System.out.println();
		}
	}
}

package Lec_6;

import java.util.Scanner;

public class Pat_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 5;
		int row = 1;
		int num_space = 2 * n - 3;
		int num_star = 1;
		while (row <= n) {
			int star = 1;
			while (star <= num_star) {
				System.out.print("* ");
				star++;
			}

			int space = 1;
			while (space <= num_space) {
				System.out.print("  ");
				space++;
			}
			star = 1;
			if(row==n) {
				star=2;
			}
			while (star <= num_star) {
				System.out.print("* ");
				star++;
			}

			row++;
			num_star++;
			num_space=num_space-2;
			System.out.println();
		}
	}
}

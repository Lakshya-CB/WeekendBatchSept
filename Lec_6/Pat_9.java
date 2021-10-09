package Lec_6;

import java.util.Scanner;

public class Pat_9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 9;
		int row = 1;
		int num_space = n - 1;
		int num_star = 1;
		while (row <= n) {
			int space = 1;
			while (space <= num_space) {
				System.out.print("  ");
				space++;
			}

			int star = 1;
			while (star <= num_star) {
				if (star % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
				star++;
			}
//			
			row++;
//			num_star = num_star + 1;

			num_star = num_star + 2;
			num_space--;
			System.out.println();
		}
	}
}

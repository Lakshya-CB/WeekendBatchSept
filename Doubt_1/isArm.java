package Doubt_1;

import java.util.Scanner;

public class isArm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int backup = n;
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
//		System.out.println(count);
		int num = 0;
		n = backup;
		while (n != 0) {
			int digit = n % 10;
			n = n / 10;
			num = num + (int) (Math.pow(digit, count));
		}
//		System.out.println(num);
		if (num == backup) {
			System.out.println("true");

		} else {
			System.out.println("false");

		}
	}
}

package Doubt_1;

import java.util.Scanner;

public class Chew_baka {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long num = 0;
		long mult = 1;

		while (n != 0) {
			long digit = n % 10;
			long anti_digit = 9 - digit;
			if (n != 9 && anti_digit < digit) {
				num = anti_digit * mult + num;
			} else {
				num = digit * mult + num;
			}
			n = n / 10;
//			System.out.println(digit+"*"+mult + " + "+num );
			mult = mult * 10;
		}
		System.out.println(num);

	}
}

package Lec_4;

import java.util.Scanner;

public class Reverse_Digits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
		int n = 52309;
		int rev = 0;
		while (n!=0) {
			int digit = n%10;
			n = n /10;
			System.out.println(digit);
			rev = rev*10 + digit;
		}
	}

}

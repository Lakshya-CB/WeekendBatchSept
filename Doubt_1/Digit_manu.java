package Doubt_1;

import java.util.Scanner;

public class Digit_manu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = 0;
		int mult = 1;
		
		while(n!=0) {
			int digit = n%10;
			n = n /10;

//			System.out.println(digit+"*"+mult + " + "+num );
			num = digit*mult + num;
			mult = mult*10;
		}
		System.out.println(num);
	}
}

package Lec_3;

import java.util.Scanner;

public class XCheck_prime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 1;
		int total_factors = 0;
		while (fact <= n) {
			if (n % fact == 0) {
				total_factors = total_factors + 1; 
			}
			System.out.println(fact);
			fact = fact + 1;
		}
		System.out.println(total_factors);
		if(total_factors>2) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}

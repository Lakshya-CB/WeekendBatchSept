package Lec_4;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 1;
		int a = 0;
		int b = 1;
		while (i <= n) {
			int c = a+b;
//			System.out.println(a);
			a=b;
			b=c;
			i = i + 1;
		}
		System.out.println(a);

	}
}

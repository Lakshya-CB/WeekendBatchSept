package Lec_20;

public class Strairs {
	static int count = 0;

	public static void main(String[] args) {
//		count=0;
//		climb(0, 5,"");
//		System.out.println("ANS is "+count);
//		maze(0, 0, 2, 2, "");
//		perm("abc", "");
//		System.out.println(0);

//		for (int i = 0; i < 10; i++) {
//			lex_c(i);
//		}
//		lex_c(13);
		for (int i = 1; i <= 9; i++) {
			Jumpin(i, 105);
		}
	}

	public static void climb(int curr, int des, String ans) {
//		-ve BC
		if (curr > des) {
			return;
		}
		// +ve BC
		if (curr == des) {
			count++;
			System.out.println(ans);
			return;
		}

		climb(curr + 1, des, ans + 1);
		climb(curr + 2, des, ans + 2);
		climb(curr + 3, des, ans + 3);

	}

	public static void maze(int currx, int curry, int destx, int desy, String ans) {
		if (currx > destx || curry > desy) {
			return;
		}

		// +bc
		if (currx == destx && curry == desy) {
			System.out.println(ans);
			return;
		}

		maze(currx, curry + 1, destx, desy, ans + "R");
		maze(currx + 1, curry, destx, desy, ans + "D");

	}

	public static void perm(String options, String ans) {
		if (options.isEmpty()) {
			System.out.println(ans);
		}
		for (int i = 0; i < options.length(); i++) {
//			Delete char at 
			String rem = options.substring(0, i) + options.substring(i + 1);
			perm(rem, ans + options.charAt(i));
		}
	}

	public static void lex_c(int n) {
		if (n > 1000) {
			return;
		}
		System.out.println(n);
		int i = 0;
		if (n == 0) {
			i = 1;
		}
		for (; i < 10; i++) {
			lex_c(n * 10 + i);
		}
	}

	public static void Jumpin(int n, int limit) {
		if (n > limit) {
			return;
		}

		System.out.println(n);

		int digit = n % 10;
		if (digit < 9)
			Jumpin(n * 10 + digit + 1, limit);
		if (digit > 0)
			Jumpin(n * 10 + digit - 1, limit);

	}
}

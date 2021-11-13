package Lec_14_15;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
		soe(25);
	}

	public static void soe(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);

		for (int fac = 2; fac * fac <= n; fac++) {
//			table of fac
			if (prime[fac]) {
				for (int pro = fac * 2; pro <= n; pro = pro + fac) {
					prime[pro] = false;
				}
				System.out.print(fac+" : ");
				disp(prime);
			}
		}
	}

	public static void disp(boolean[] prime) {
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println("=========");

	}
}

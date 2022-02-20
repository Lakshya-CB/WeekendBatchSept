package Lec_40_extra;

import java.util.Scanner;

public class Nth_root {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int N = scn.nextInt();
			int M = scn.nextInt();

			double ans = Math.pow(M, 1.0 / N);

			int I = (int) ans;
//			System.out.println(ans+" "+ I);
			if (ans - I > 0.9999) {
				ans = I + 1.0;
				I = I + 1;
			}

//			System.out.println(ans+" "+ I);
			if (ans - I > 0) {
				// something kuch point hein
				System.out.println(-1);
			} else {
				System.out.println(I);
			}
		}

	}
}
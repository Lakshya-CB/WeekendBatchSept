package Lec_16;

import java.lang.*;

public class string_demo_3 {
	public static void main(String[] args) {
		int n = 100000;

		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i <= n; i++) {
			str = str + i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}
}

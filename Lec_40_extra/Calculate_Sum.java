package Lec_40_extra;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_Sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int mod = 1000000000 + 7;
		int size = scn.nextInt();
		
		long[] arr =new long[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextLong();
		}
//		System.out.println(Arrays.toString(arr));

//		int[] arr_next = new int[arr.length];
		int Q = scn.nextInt();
		while (Q>0) {
			Q--;
//			System.out.println("Operation : ");
			int X = scn.nextInt();

			long[] arr_next = new long[arr.length];

			for (int i = 0; i < arr.length; i++) {
				int last_idx = (i - X) % arr.length;
				if (last_idx < 0) {
					last_idx = last_idx + arr.length;
				}
				arr_next[i] = (arr[i] + arr[last_idx])%mod;

			}
			arr = arr_next;
//			System.out.println(Arrays.toString(arr));

		}
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans + arr[i];
		}
		System.out.println(ans%mod);
	}
}

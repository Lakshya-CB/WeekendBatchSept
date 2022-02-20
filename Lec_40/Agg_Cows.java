package Lec_40;

import java.util.Arrays;
import java.util.Scanner;

public class Agg_Cows {
	public static void main(String[] args) {
//	5 3
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		int Cows = scn.nextInt();
		int[] stalls = new int [s];
		for(int i=0;i<s;i++) {
			stalls[i] = scn.nextInt();
		}
		Arrays.sort(stalls);
//		System.out.println(check(stalls, 4, Cows));
		int start = 1;
		int end = stalls[stalls.length - 1] - stalls[0];
		int ans = 0;
		while (start <= end) {
			int mid_D = (start + end) / 2;
			if (check(stalls, mid_D, Cows)) {
				ans = mid_D;
				start = mid_D + 1;
			} else {
				end = mid_D - 1;
			}
		}
		System.out.println(ans);
		
	}

	public static boolean check(int[] stalls, int k, int Cows) {
		int c = 1;
		int prev_stall = stalls[0];
		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - prev_stall >= k) {
//				System.out.println(stalls[i]);
				c++;
				prev_stall = stalls[i];
			}
		}
		return c >= Cows;
	}
}

package Lec_35_Rev;

import java.util.Scanner;

public class Arrays_extra {
	public static void main(String[] args) {
//		int[] arr = { 8, -8, 11, -9, 10000, -11,- 99 };
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			int a = Circular(arr);
			int b = M2(arr);
			System.out.println(a + "===" + b);
		}
	}

	public static int Circular(int[] arr) {
//		case 1: Simple sub array, 
		int sum = 0;
		int ans1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			ans1 = Math.max(ans1, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
//		case 2: Max sub array sum, ghuum ke jaa rha hein!
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum = total_sum + arr[i];
			arr[i] = arr[i] * -1;
		}
		sum = 0;
		int ans2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			ans2 = Math.max(ans2, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		ans2 = total_sum + ans2;
//		System.out.println(Math.max(ans1, ans2));
		return Math.max(ans1, ans2);
	}

	public static int M2(int[] arr) {
		int sum = 0;
		int ans1 = 0;
		int count = 0;
		int start=0;
		for (int i = 0; i < 2 * arr.length; i++) {
			
			sum = sum + -1*arr[i % arr.length];
			count++;
			ans1 = Math.max(ans1, sum);
			if (sum < 0) {
				sum = 0;
				count = 0;
				start = i+1;
			}
			System.out.println(sum+ ","+i+" = "+start);
			if (count == arr.length) {
				break;
			}
		}
//		System.out.println(ans1);
		return ans1;
	}
}

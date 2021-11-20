package Lec_18;

import java.util.Arrays;

public class Array_rec_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 10, 10 };
//		print_rev_1(arr, 0);
//		print_rev_2(arr, 0);
//		System.out.println(MAX(arr, 0));
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(First_Occur(arr, 99, 0));
//		System.out.println(Last_Occur(arr, 10, 0));
		int[] ans = ALL_Occ(arr, 10, 0, 0);
		System.out.println(Arrays.toString(ans));
//		System.out.println(ALL_Occ(arr, 10, 0, 0));
	}

	public static void print_rev_1(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//			BP = print from idx to arr.length
//			SP = print from idx+1 to arr.length
		System.out.println(arr[arr.length - 1 - idx]);
		print_rev_1(arr, idx + 1);

	}

	public static void print_rev_2(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//			BP = print from idx to arr.length
//			SP = print from idx+1 to arr.length , 50,40,30,20
		print_rev_2(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int MAX(int[] arr, int idx) {
//		if(idx==arr.length) {
//			return Integer.MIN_VALUE;
//		}
		if (idx == arr.length - 1) {
			return arr[idx];
		}
//		BP : max of idx to end elements.
//		SP : max of idx+1 to end elements.
		int sp = MAX(arr, idx + 1);

		return Math.max(sp, arr[idx]);
	}

	public static int First_Occur(int[] arr, int ele, int idx) {
//		BP = FO of ele in idx to last.
//		SP = FO of ele in edx+1 to last;
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == ele) {
			return idx;
		}
		int sp = First_Occur(arr, ele, idx + 1);
		return sp;
	}

	public static int Last_Occur(int[] arr, int ele, int idx) {
//		BP = FO of ele in idx to last.
//		SP = FO of ele in edx+1 to last;
		if (idx == arr.length) {
			return -1;
		}
		int sp = Last_Occur(arr, ele, idx + 1);
		if (sp == -1 && arr[idx] == ele) {
			return idx;
		}
		return sp;
	}

	public static int[] ALL_Occ(int[] arr, int ele, int idx, int count) {
		if (idx == arr.length) {
			return new int[count];
//			System.out.println(count);
//			return ;
		}

		if (arr[idx] == ele) {
			int[] sp = ALL_Occ(arr, ele, idx + 1, count + 1);
			sp[count] = idx;
			return sp;

		} else {
			int[] sp = ALL_Occ(arr, ele, idx + 1, count);
			return sp;

		}

	}
}

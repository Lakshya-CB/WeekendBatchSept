package Lec_17;

public class Array_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr,0);
	}

	public static void print(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP = print from idx to arr.length
//		SP = print from idx+1 to arr.length
		System.out.println(arr[idx]);
		print(arr, idx + 1);

	}
}

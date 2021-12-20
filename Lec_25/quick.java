package Lec_25;

import java.util.Arrays;

public class quick {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };

		quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
//		find pivot!!
		int mid = (start + end) / 2;
		int pivot = arr[mid];
		int left = start;
		int right = end;

		while (left <= right) {
//		find left problem, find right ploblem
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

//		swap!! left index with right index
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quick(arr, start, right);
		quick(arr, left, end);

	}
}

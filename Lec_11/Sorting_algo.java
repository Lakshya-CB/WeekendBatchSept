package Lec_11;

public class Sorting_algo {
	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
//		int[] arr = { 1, 3, 7, 11, 4 };
		insertion(arr);
		// bubble(arr);
//		selection(arr);
//		disp(arr);
	}

	public static void insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int idx = i-1;
			while (idx >= 0 && arr[idx] > temp) {
				arr[idx + 1] = arr[idx];
				idx--;
				disp(arr);
			}
			arr[idx + 1] = temp;
			disp(arr);
			System.out.println("==================");
		}
	}

	public static void bubble(int[] arr) {
		for (int counter = 1; counter <= arr.length; counter++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			int min = idx;
			for (int i = idx; i < arr.length; i++) {
				if (arr[min] > arr[i]) {
					min = i;
				}
			}
			if (idx != min) {
				disp(arr);
				swap(arr, idx, min);
				disp(arr);
				System.out.println("=================");
			}
		}
	}

	public static void disp(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

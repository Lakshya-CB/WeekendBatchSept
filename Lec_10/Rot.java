package Lec_10;

public class Rot {
	public static void main(String[] args) {
//		int arr[] = { 10, 20, 30, 40, 50, 60 };
//		int rot = -2;

//		way 1 
		
		// rot arr.length is same as rotation 0
//		rot = rot % arr.length;
//
//		// if rot is -ve,( -1 rotation = arr.length-1)
//		if (rot < 0) {
//			rot = rot + arr.length;
//		}
//
//		for (int i = 1; i <= rot; i++) {
//			rot(arr);
//		}
//		disp(arr);

		
//		way 2 , trick 
		
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int rot = 6;
		
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
		
		
//		reverse part 2
		reverse(arr, arr.length-rot, arr.length-1);
//		reverse part 1
		reverse(arr, 0, arr.length-rot-1);
//		Reverse full array
		reverse(arr, 0, arr.length-1);
		
		disp(arr);
	}

// rotate array right side
	public static void rot(int[] arr) {
		int last = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];

//			disp(arr);
		}
		arr[0] = last;
	}

	public static void reverse(int[] arr, int start, int end) {

		while (start < end) {
//			Swap!!
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;

			start++;
			end--;
		}
	}

	public static void disp(int[] arr) {
		System.out.println("----");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}

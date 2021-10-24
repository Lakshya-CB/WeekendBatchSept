package Lec_10;

public class Rev {
	public static void main(String[] args) {
		int[] arr = { 10, 8, 13, 15, 7, 21, 423, 51 };

//		Create another new array
		int[] arrRev = new int[arr.length];

//		way 1
//		rev1(arr, arrRev);
//		disp(arrRev);

//		way 2 , without using an extra array
//		disp(arr);
//		rev2(arr);
//		disp(arr);
		
//		way 3 , galat tarika fixed when i = length/2;
		disp(arr);
		rev3(arr);
		disp(arr);
		
	}
	public static void rev3(int[] arr) {
		
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
//			System.out.println("---------");
//			disp(arr);
		}
	}
	
	
	public static void rev1(int[] arr, int[] arrRev) {
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arrRev[i] = arr[len - 1];
			len--;
		}
	}

	public static void rev2(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
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
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}

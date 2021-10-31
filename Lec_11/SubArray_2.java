package Lec_11;

public class SubArray_2 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int count = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
//				disp_adv(arr, i, j);
				sum=sum+arr[j];
				max = Math.max(max, sum);

				System.out.println("Sum is = " + sum);
				System.out.println("----------");
			}
		}
//			System.out.println("Total Sub arrays = " + count);
		System.out.println(max);
	}

	public static void disp_adv(int[] arr, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	
}

package Lec_10;

public class SubArrays {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int count = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
//				disp_adv(arr, i, j);
				count++;
				int sum = add_adv(arr, i, j);
				
				// compare the sum to ghet maximum sub array sum.
				if(max<sum) {
					max = sum;
				}
				
				System.out.println("Sum is = "+ sum);
				System.out.println("----------");
			}
		}
//		System.out.println("Total Sub arrays = " + count);
		System.out.println(max);
	}

	public static void disp_adv(int[] arr, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	public static int add_adv(int[] arr, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}

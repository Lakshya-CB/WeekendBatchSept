package Lec_10;

public class inv {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 1, 0 };
		disp(inv_(arr));
	}

	public static int[] inv_(int[] arr) {
		int[] narr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			narr[arr[i]] = i;
		}
		return narr;
	}

	public static void disp(int[] arr) {
		System.out.println("----");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

}

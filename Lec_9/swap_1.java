package Lec_9;

public class swap_1 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
//		swap(a1[0], a2[0]); //Answer is Nope
		a1[0] =1111;
		// for print
		disp(a1);
		disp(a2);

		
		swap_in(a1, a2, 3);
		//for print 
		disp(a1);
		disp(a2);
		
	}
	public static void disp(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void swap(int a, int b) {
		int temp = b;
		b = a;
		a = temp;
	}

	public static void swap_in(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;
	}
}

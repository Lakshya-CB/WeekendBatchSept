package Lec_9;

public class swap_1 {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };

//		swap(a1[0], a2[0]); //Answer is Nope
		// for print
		for(int ele : a1) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for(int ele : a2) {
			System.out.print(ele + " ");
		}
		System.out.println();
		////
		
		swap_in(a1, a2, 3);
		
		//for print 
		for(int ele : a1) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for(int ele : a2) {
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

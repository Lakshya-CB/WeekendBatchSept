package Lec_29;

import java.util.LinkedList;
import java.util.Queue;

public class QPS_Qs {
	public static void main(String[] args) {
//		Queue<Integer> Q = new LinkedList<Integer>();
//		Q.add(10);
//		Q.add(20);
//		Q.add(30);
//		Q.add(40);
//		Q.add(50);
//		System.out.println(Q);
////		revQ(Q);
//		PrintQ(Q, 0);
//		System.out.println(Q);
		int arr[] = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		First_neg(arr, 2);
	}

	public static void revQ(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.poll();
		revQ(Q);
		System.out.println(temp);
		Q.add(temp);
	}

	public static void PrintQ(Queue<Integer> Q, int count) {
		if (Q.size() == count) {
			return;
		}
		int temp = Q.poll();
		Q.add(temp);

		PrintQ(Q, count + 1);
		System.out.println(temp);
	}

	public static void First_neg(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<Integer>();
//		Create first window!!
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		for (int i = 0; i <= arr.length - k; i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(arr[j]+ " ");
			}
			if (!Q.isEmpty())
				System.out.println(" = "+arr[Q.peek()]);	
			else {
				System.out.println(" = null");		
			}

			int last_idx = i + k;
			if (last_idx < arr.length && arr[last_idx] < 0) {
				Q.add(last_idx);
			}
			if (!Q.isEmpty() && Q.peek() == i) {
				Q.poll();
			}
		}
	}
}

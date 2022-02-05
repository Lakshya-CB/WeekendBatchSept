package Lec_36;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Stack_playing_with_cards {

	public static void main(String[] pp) {
		System.out.println(pp.length);
		
		for(String ll : pp) {
			System.out.println(ll);
		}
		Checkchek.main(pp);
//		Stack<Integer> S = new Stack<>();
//		S.add(5 1
//				3 4 7 6 5)
//		S.add(3);
//		S.add(4);
//		S.add(7);
//		S.add(6);
//		S.add(5);
////		play(S, 1);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int size = sc.nextInt();
			Integer[] arr = new Integer[size];

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr, new formBig());

//			System.out.println(Arrays.toString(arr));
			String ans = "";
			for (int i = size - 1; i >= 0; i--) {
				ans = ans + arr[i];
			}
			System.out.println(ans);
		}
	}

	public static void play(Stack<Integer> S, int Q) {
		int[] prime = { 2, 3, 5, 7, 11, 13, 17 };
		for (int i = 0; i < Q; i++) {
			Stack<Integer> B = new Stack<>();
			Stack<Integer> An = new Stack<>();
			while (!S.isEmpty()) {
				int card = S.pop();
				if (card % prime[i] == 0) {
					B.add(card);
				} else {
					An.add(card);
				}
			}
//			Print B!!
			System.out.println(B);
			System.out.println("======");

//			Update Stack to work on!!
			S = An;

		}
		System.out.println(S);
	}

	static class formBig implements Comparator<Integer> {

		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
//			o1-o2
			String a1 = "" + o1 + o2;
			String a2 = "" + o2 + o1;

			long l1 = Long.parseLong(a1);
			long l2 = Long.parseLong(a2);
			if (l1 >= l2) {
				return 1;
			} else {
				return -1;
			}
			// return (int) (l1 - l2);
		}

	}
}

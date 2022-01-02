package Lec_28;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPs {
	public static void main(String[] args) {
//		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
//		nextGr8(arr);
//		nextGr8_order(arr);
		int[] arr = {80,50,70,30,20,40,90,10,5,35};
		stock_span(arr);
	}

	public static void nextGr8(int[] arr) {
		Stack<Integer> S = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!S.isEmpty() && S.peek() < arr[i]) {
				System.out.println(S.pop() + "=>" + arr[i]);
			}
			S.push(arr[i]);
		}
		while (!S.isEmpty()) {
			System.out.println(S.pop() + "=>" + -1);
		}
	}
	public static void nextGr8_order(int[] arr) {
		Stack<Integer> S = new Stack<Integer>();
		int[] ans = new int[arr.length];
		Arrays.fill(ans,-1);
		
		for (int i = 0; i < arr.length; i++) {
			while (!S.isEmpty() && arr[S.peek()] < arr[i]) {
//				System.out.println(arr[S.pop()] + "=>" + arr[i]);
				ans[S.pop()]= arr[i];
			}
			S.push(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + "=>" + ans[i]);
			
		}
		
	}
	
	public static void stock_span(int[] stonks) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[stonks.length];
		for(int i=stonks.length-1;i>=0;i--) {
			while(!S.isEmpty()&&stonks[S.peek()]<stonks[i]) {
				int stock_span = S.peek()-i;
				ans[S.pop()] = stock_span;
			}
			S.push(i);
		}
		while(!S.isEmpty()) {
			int stock_span = S.peek()+1;
			ans[S.pop()] = stock_span;
		}
		for(int i=0;i<stonks.length;i++) {
			System.out.println(stonks[i]+"="+ans[i]);
		}
	}
}

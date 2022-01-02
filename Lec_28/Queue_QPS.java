package Lec_28;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
//		System.out.println(Q);
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		System.out.println(Q.poll());
//		
		System.out.println(Q);
		revQ(Q);
//		System.out.println(Q);
	}
	public static void revQ(Queue<Integer>Q) {
		if(Q.isEmpty()) {
			return;
		}
		int num = Q.poll();
		revQ(Q);
		System.out.println(num);
		Q.add(num);
	}
	public static void revQQ(Queue<Integer>Q) {
		if(Q.isEmpty()) {
			return;
		}
		int num = Q.poll();
		revQQ(Q);
//		System.out.println(num);
		Q.add(num);
	}
}

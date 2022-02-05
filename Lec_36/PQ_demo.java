package Lec_36;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
//		Ranks!! min Heap!!
//		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		
//		Marks, Max heap!!
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		
		PQ.add(10);
		PQ.add(100);
		PQ.add(3);
		PQ.add(20);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		
	}
}

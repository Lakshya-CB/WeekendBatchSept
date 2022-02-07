package Lec_37;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap_QPS {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> s1 = new ArrayList<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		AL.add(s1);

		AL.add(new ArrayList<Integer>());
		AL.get(1).add(15);
		AL.get(1).add(35);

		AL.add(new ArrayList<Integer>());
		AL.get(2).add(5);
		AL.get(2).add(7);
		AL.get(2).add(12);
		AL.get(2).add(25);

		AL.add(new ArrayList<Integer>());
		AL.get(3).add(17);
		AL.get(3).add(22);
		AL.get(3).add(40);

//		System.out.println(AL);

//		System.out.println(Merge(AL));
		
		int[] arr = {20,30,60,50,10,55,57,40};
		kLargest(arr, 3);
	}

	public static ArrayList<Integer> Merge(ArrayList<ArrayList<Integer>> AL) {
		// merge k sorted lists!!
		// O(nlogk)
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Pair> PQ = new PriorityQueue<>();
//		create our heap!!
		for (int i = 0; i < AL.size(); i++) {
			Pair p = new Pair();
			p.data = AL.get(i).get(0);
			p.idx_AL = i;
			PQ.add(p);
		}
		
		while (!PQ.isEmpty()) {
			Pair p = PQ.poll();

			ans.add(p.data);
			if (p.idx_d + 1 < AL.get(p.idx_AL).size()) {
				p.idx_d = p.idx_d + 1;
				p.data = AL.get(p.idx_AL).get(p.idx_d);
				PQ.add(p);
			}	
		}
		return ans;
	}

	static private class Pair implements Comparable<Pair> {
		int data;
		int idx_d;
		int idx_AL;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
//			this - o 
			return this.data - o.data;

		}
	}
	public static void kLargest(int[] arr,int k) {
		
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			PQ.add(arr[i]);
			if(PQ.size()>k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}
}

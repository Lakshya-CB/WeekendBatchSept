package Lrec_35;

import java.util.ArrayList;


public class Queue<PP> implements DS {
	ArrayList<PP> data;
	int start;
	int size;

	public Queue() {
		// TODO Auto-generated constructor stub
//		data = new PP[5];
		ArrayList<PP> data = new ArrayList<>(5);

	}

	public void Add(PP ali) {
		int idx = start + size;
		idx = idx%data.size();
		data.set(idx, ali);
		size++;
	}

	public int size() {
		return size;
	}
	public PP peek() {
		return data.get(start);
	}
	public PP poll() {
		PP ans = data.get(start);
		start++;
		start= start%data.size();
		size--;
		return ans;	
	}
	public void disp() {
		for(int i=start;i<start+size;i++) {
			System.out.print(data.get(i%data.size())+" ");
		}
		System.out.println();
	}
	public boolean isFull() {
		return size==data.size();
	}
}

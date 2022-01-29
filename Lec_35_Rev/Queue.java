package Lec_35_Rev;

public class Queue {
	int[] data;
	int start;
	int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		data = new int[5];

	}

	public void Add(int ali) {
		int idx = start + size;
		idx = idx%data.length;
		data[idx] = ali;
		size++;
	}

	public int size() {
		return size;
	}
	public int peek() {
		return data[start];
	}
	public int poll() {
		int ans = data[start];
		start++;
		start= start%data.length;
		size--;
		return ans;	
	}
	public void disp() {
		for(int i=start;i<start+size;i++) {
			System.out.print(data[i%data.length]+" ");
		}
		System.out.println();
	}
	public boolean isFull() {
		return size==data.length;
	}
	
}

package Lec_26;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	protected int[] arr;
	private int tos = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		
	}

	public Stack(int cap) {
		arr = new int[cap];

	}

	public void Push(int ali) throws Exception {
		if(isFull()) {
			throw new Exception("Bhai bat man, Stack puri hein");
		}
		tos++;
		arr[tos] = ali;
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Kya deekh rha hein ?");
		}
		return arr[tos];
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Merry Christmas ");  
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public int size() {
		return tos+1;
	}
	public boolean isFull() {
		return this.size()==arr.length;
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	public void disp() {
		int temp = tos;
		while(temp>=0) {
			System.out.print(arr[temp]+" ");
			temp--;
		}
		System.out.println();
	}
}

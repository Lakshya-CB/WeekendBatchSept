package Lec_27;

import Lec_26.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void Push(int ali) throws Exception {
		if(this.isFull()) {
			int[] big = new int[arr.length*2];
//			copy
			for(int i=0;i<arr.length;i++) {
				big[i]= arr[i];
			}
			this.arr = big;
		}
		super.Push(ali);
		
	}
}

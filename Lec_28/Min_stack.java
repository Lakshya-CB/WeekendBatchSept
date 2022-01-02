package Lec_28;

import Lec_27.Dynamic_Stack;

public class Min_stack extends Dynamic_Stack {
	int min;

	@Override
	public void Push(int ali) throws Exception {
		if (this.isEmpty()) {
			min = ali;
			super.Push(ali);

		} else {
			if (ali < min) {
//				Glitch karke value dalo and min;
				int num = ali + (ali - min);
				min = ali;

				super.Push(num);
			} else {
				super.Push(ali);

			}
		}

	}

	@Override
	public int peek() throws Exception {
		if (super.peek() < min) {
//		glitch that means prev_min got updated to min!!
			return min;
		}
		else {
			return super.peek();
		}
	}
	@Override
	public int pop() throws Exception {
		if(super.peek()<min) {
//		Glitch!!
//			update min and return min!!
			int num=super.pop();
			int prev_min = 2*min-num;
			int curr_min = min;
			min = prev_min;
			return curr_min;
		} else {
			return super.pop();
		}
	}
	public int getMin() {
		return min;
	}
}

package Lec_13;

import java.util.ArrayList;
import java.util.Collections;

public class Sum_2_array {
	public static void main(String[] args) {
		int[] arr1 = { 9,8,7,5 };
		int arr2[] = 		{  9,6,7};

		System.out.println(sum(arr1, arr2));
	}

	public static ArrayList<Integer> sum(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		while (idx1 >= 0 || idx2 >= 0) {

			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}

//			sum=12, carry = 1, digit = 2;
			carry = sum / 10;
			int digit = sum % 10;

//			ans.add(0, digit);
			ans.add(digit);
			idx1--;
			idx2--;

		}
		if(carry>0) {
//			ans.add(0, carry);
			ans.add(carry);
		}
		
		Collections.reverse(ans);
		
		return ans;
	}
}

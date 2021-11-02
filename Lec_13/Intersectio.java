package Lec_13;

import java.util.ArrayList;

public class Intersectio {
	public static void main(String[] args) {
		int arr1[] = { 5,5,5,5,5,5,5,5,5,5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
		int arr2[] = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
		System.out.println(inter(arr1, arr2));
	}

	public static ArrayList<Integer> inter(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
// code here!!
		int idx1=0;
		int idx2=0;
		
		while(idx1<arr1.length && idx2<arr2.length) {
//			System.out.println("=========================");
//			System.out.println(idx1+"  "+idx2);
//			System.out.println(arr1[idx1]+"  "+arr2[idx2]);
			
			if(arr1[idx1]==arr2[idx2]) {
				ans.add(arr1[idx1]);
				idx1++;
				idx2++;
			}
			else if(arr1[idx1]>arr2[idx2]) {
				idx2++;
			}
			else {
				idx1++;
			}
		}
		
		return ans;

	}
}

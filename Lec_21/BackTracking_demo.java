package Lec_21;

import java.util.ArrayList;

public class BackTracking_demo {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		print_arr(arr, 0, "", new ArrayList<Integer>());
		
	}
	public static void print_arr(int[] arr, int idx, String sol,ArrayList<Integer> ans) {
		if(idx==arr.length) {
			System.out.println(sol);
			System.out.println(ans);
			System.out.println("==================");
			return;
		}
		ans.add(arr[idx]);
		print_arr(arr, idx+1, sol+arr[idx]+"=", ans);
		ans.remove(ans.size()-1);
		System.out.println(sol);
		System.out.println(ans);
		System.out.println("==================");
	}
}

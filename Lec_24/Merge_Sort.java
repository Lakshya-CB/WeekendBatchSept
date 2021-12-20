package Lec_24;

import java.util.Arrays;

public class Merge_Sort {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 30, 50, 80, 100 };
//		int[] arr2 = { 15, 20, 25, 40, 90 };
		
//		System.out.println(Arrays.toString(merge(arr1, arr2)) );
		
		int[] arr = {123,76,-12,42,7};
		System.out.println(Arrays.toString(merge_sort(arr, 0, arr.length-1)) );
		
	}
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length+arr2.length];
		int idx1=0;
		int idx2=0;
		int i=0;
		
		while(idx1<arr1.length && idx2<arr2.length) {
			if(arr1[idx1]<arr2[idx2]) {
				ans[i]=arr1[idx1];
				i++;
				idx1++;
			}else {
				ans[i]=arr2[idx2];
				i++;
				idx2++;
			}
		}
		while(idx1<arr1.length) {
			ans[i]=arr1[idx1];
			i++;
			idx1++;	
		}
		while(idx2<arr2.length) {
			ans[i]=arr2[idx2];
			i++;
			idx2++;	
		}
		return ans;
	}

	
	public static int[] merge_sort(int[] arr,int low, int high ) {
		if(low==high) {
			int[] bc = new int[1];
			bc[0] = arr[low];
			return bc;
		}
		int mid = (low+high)/2;
		int[]sp1 = merge_sort(arr, low, mid);
		int[]sp2 = merge_sort(arr, mid+1,high);
		
		int[] ans = merge(sp1, sp2);
		return ans;
		
	}
}

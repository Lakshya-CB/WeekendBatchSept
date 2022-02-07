package Lec_37;

import java.util.HashMap;

public class HashMap_QPS {
	public static void main(String[] args) {
		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
		inter(arr1, arr2);
	}

	public static void inter(int[] arr1, int[] arr2) {
//		store an array in your HashMap
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
//			Method 1
//			if(map.containsKey(arr1[i])) {
//				int old_freq =map.get(arr1[i]);
//				map.put(arr1[i],old_freq +1);
//			}else {
//				map.put(arr1[i], 1);	
//			}
//			Method 2
			int old_freq= map.getOrDefault(arr1[i], 0);
			map.put(arr1[i],old_freq+1);
		}
		System.out.println(map);
		
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i])>0) {
				System.out.print(arr2[i]+ " ");
				int freq = map.get(arr2[i]);
				map.put(arr2[i],freq-1);
			}	
		}
	}
	
}

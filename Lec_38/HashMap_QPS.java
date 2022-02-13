package Lec_38;

import java.util.HashMap;

public class HashMap_QPS {
	public static void main(String[] args) {
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		ConscSubSeq(arr);
	}	

	public static void ConscSubSeq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i], false);
			}else {
				map.put(arr[i], true);	
			}
			if(map.containsKey(arr[i]+1)) {
				map.put(arr[i]+1, false);
			}
		}
		System.out.println(map);
		for(int key: map.keySet()) {
			if(map.get(key)) {
				int start = key;
//				System.out.println(start);
				while(map.containsKey(start)) {
					System.out.print(start+" ");
					start++;
				}
				System.out.println();
			}
		}
	}
}

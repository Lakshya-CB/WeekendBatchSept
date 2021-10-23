package Lec_9;

public class Arrays_demo3 {
	public static void main(String[] args) {
		int[] arr = new int[50]; 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		int[] other = arr;
		other[0]=99;
		arr[0]=20;
		
		System.out.println(other[0]);
		System.out.println(arr[0]);
//		Same address ?
		System.out.println(other);
		System.out.println(arr);
		
//		
		System.out.println(other == arr);
		System.out.println(other.length);
		System.out.println(arr.length);
		
//		Creating array using literals
		int[] arr2 = {12,13,14,15};
		System.out.println(arr2);
		for(int ele: arr2) {
			System.out.print(ele+" ");
		}
		
	}
}

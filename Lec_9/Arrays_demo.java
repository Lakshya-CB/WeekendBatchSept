package Lec_9;

public class Arrays_demo {
	public static void main(String[] args) {
		int[] arr = new int[20]; 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		Error out of bounds
//		System.out.println(arr[5]);
		
//		Size of array
		System.out.println(arr.length);
		
		
		arr[19] = 9999;
		arr[18] = 99990;
		
		
		System.out.println("------------------");
		
//		Print your array
		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
			arr[i]=i;
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}
}

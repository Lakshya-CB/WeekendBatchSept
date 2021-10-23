package Lec_9;

public class Max_array {
	public static void main(String[] args) {
		int[] arr = { -1,-2,-10,-11,-234,-31 };
		
		int max = arr[0];
//		System.out.println(max);
		for(int ele : arr) {
			if(max<ele) {
				max = ele;
			}
		}
		System.out.println(max);
	}
}

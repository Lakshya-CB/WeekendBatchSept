package Lec_11;

public class Binary_search {
	public static void main(String[] args) {
		int[]Arr = {5,7,11,12,15,20,31,33,35,40,45,55,58,66,71};
		System.out.println(BS(Arr, 45));
	
	}
	public static int BS(int[] arr,int ele) {
//		Assume array increasing
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			System.out.println(low + " - "+mid+" - "+high);
			if(arr[mid]==ele) {
				return mid;
			}
			else if(arr[mid]<ele) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
}

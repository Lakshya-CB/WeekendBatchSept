package Lec_9;

public class Linear_Searcj {
	public static void main(String[] args) {
		int[] arr = { -1,-2,-10,-11,-234,-31 };
		int ele = -100;
		boolean found = false;
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]==ele) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("found at index " + i);
		}
		else {
			System.out.println("Nahi mila bhai");
		}
	}
}

package Lec_9;

import java.util.Scanner;

public class Array_input_and_print {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Array ka size kya hein ?");
		int n = scn.nextInt();
		int[] arr =  new int[n]; 
		
		for(int i=0;i<n;i++) {
			arr[i]= scn.nextInt();
		}
		
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}

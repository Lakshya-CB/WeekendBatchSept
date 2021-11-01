package Lec_12;

import java.util.Scanner;

public class Array_2D_demo {
	public static void main(String[] args) {
//		int[] arr = new int[0];
		int[][] arr = new int[5][5];
		int[][][] arr33 = new int[5][5][5];
		
		System.out.println(arr);
		
		System.out.println(arr[0]);
		
		int[] lol= arr[0];
		for(int ele : lol) {
			System.out.println(ele);
		}
		
		System.out.println("==============");
		int[][] arr_1 = new int[300][5];
		
		System.out.println(arr_1.length);
		System.out.println(arr_1[0].length);
		
//		System.out.println(arr_1[0][5]);
		System.out.println("=============");
		
//		arr = new int[3][2];
//		Scanner scn  = new Scanner(System.in);
//		for(int row=0;row<arr.length;row++) {
//			for(int col =0;col<arr[row].length;col++) {
////				System.out.print(arr[row][col]+" ");
//				arr[row][col]= scn.nextInt();
//			}
////			System.out.println();
//		}
//		for(int[] row : arr) {
//			for(int ele : row) {
//				System.out.print(ele+" ");
//			}
//			System.out.println();
//		}
		System.out.println("==============");
		arr = new int[3][];
		for(int[] row : arr) {
//			for(int ele : row) {
//				System.out.print(ele+" ");
//			}
			System.out.println("Jadu");
			
		}
		System.out.println(arr[0]);
		
		System.out.println("====================");
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[20];
		
		for(int[] row : arr) {
			for(int ele : row) {
				System.out.print(ele+" ");
			}
			System.out.println();
			
		}	
		
	}
}

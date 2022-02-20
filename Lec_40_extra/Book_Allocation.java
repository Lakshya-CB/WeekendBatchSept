package Lec_40_extra;

import java.util.Scanner;

public class Book_Allocation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int Size = scn.nextInt();
			int total_s = scn.nextInt();
			int[] books = new int[Size];

			int tatal_pages = 0;
			for(int i=0;i<Size;i++) {
				books[i] = scn.nextInt();
				tatal_pages=tatal_pages+books[i];
				
			}

//			for (int pages = books[Size - 1]; pages <= tatal_pages; pages++) {
//				System.out.println(pages + " " + check(books, total_s, pages));
//			}
			int start = books[Size - 1];
			int end = tatal_pages;
			int ans = end;
			while(start<=end){
				int mid = (start+end)/2;
				if(check(books, total_s, mid)) {
					ans = mid;
					end = mid-1;
				}else {
					start=mid+1;
				}
			}
			System.out.println(start);
		}
	}

	public static boolean check(int[] books, int total_s, int max_pages) {
		int students = 0;
		int pages = 0;
		int i = 0;
		while (i < books.length) {
			if (pages + books[i] <= max_pages) {
//				dedo HW
				pages = pages + books[i];
				i++;
			} else {
				students++;
				pages = 0;
			}
			if (students == total_s) {
				return false;
			}
		}
		return true;
	}
}

package Lec_11;

public class Kadence_algo {
	public static void main(String[] args) {
		int[] arr = {10,-20,30,-25,40,50,-10};
		System.out.println(kadani(arr));
	}
	public static int kadani(int[] arr){
		int curr_score =0;
		int max =0;
		for(int i=0;i<arr.length;i++) {
			curr_score = curr_score+arr[i];
			System.out.println(curr_score);
			max = Math.max(max, curr_score);
			
			if(curr_score<0) {
				curr_score=0;
			}
		}
		return max;
	}
}

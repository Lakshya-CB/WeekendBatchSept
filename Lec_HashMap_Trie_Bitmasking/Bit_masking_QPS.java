package Lec_HashMap_Trie;

public class Bit_masking_QPS {
	public static void main(String[] args) {
//		System.out.println(AllSetBits(22));
		System.out.println(AllSetBitsBrianKernighan(22));

	}

	public static int makeBit1(int num, int pos) {
		int mask = 1 << pos;
		int ans = num | mask;
		return ans;
	}

	public static int makeBit0(int num, int pos) {
		int mask = 1 << pos;
		mask = ~mask;
		int ans = num & mask;
		return ans;
	}

	public static int ToggleBit(int num, int pos) {
		int mask = 1 << pos;

		int ans = num ^ mask;
		return ans;
	}

	public static int RightMostSetBit(int num) {
		int mask = ~num + 1;
		return mask & num;
	}

	public static int AllSetBits(int num) {
		int mask = 1;
		int ans = 0;
		while (mask <= num) {
			if ((mask & num) > 0) {
				ans++;
			}
			mask = mask << 1;

		}
		return ans;
	}

	public static int AllSetBitsBrianKernighan(int num) {
		int ans = 0;
		while (num > 0) {
			ans++;
			int RMB = num & (~num + 1);
			num = num - RMB;
			System.out.println(num);
		}
		return ans;
	}

	public int[] singleNumber(int[] nums) {
//https://leetcode.com/problems/single-number-iii/
		int all_zor = 0;
		for (int ali : nums) {
			all_zor = all_zor ^ ali;
		}
//			all_zor = 3^5, all set bits where the isngle occuring elements are different 
		int RMSB = all_zor & (~all_zor + 1);
		
		int setA = 0;
		int setB = 0;
		
		for (int ali : nums) {
			if ((ali & RMSB) > 0) {
//				ali has a set bit at position of RMSB of the Zor!!
//				Set A
				setA = setA^ali;
			}else {
//				ali has a 0 bit at position of RMSB of the Zor!!
//				Set B

				setB = setB^ali;
			}
		}
		int[] ans = new int[2];
		ans[0] = setA;
		ans[1] = setB;
		return ans;
	}
}

package Lec_11;

public class BAd_Version {
	 public int firstBadVersion(int n) {
	     int low = 1;
	        int high = n;
	        int ans = -1;
	        while(low<=high){
	            int mid = (high-low)/2+low;
	            boolean check= isBadVersion(mid);
	            if(check){
	                high = mid-1;
	                ans = mid;
	            }
	            else{
	                low = mid+1;
	            }
	        }
	        return ans;
	    }
}

package Lec_35_Rev;

public class Dynamic_Q extends Queue{
	
	@Override
	public void Add(int ali) {
		if(isFull()) {
			int[] nn = new int[data.length*2];
			int idx =0;
			for(int i=start;i<start+size;i++) {
				nn[idx]=data[i%data.length];
				idx++;
			}
			data = nn;
			start = 0;
		}
		super.Add(ali);
	}

}

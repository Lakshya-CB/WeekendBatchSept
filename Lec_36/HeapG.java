package Lec_36;

import java.util.ArrayList;

public class HeapG<G extends Comparable<G>> {

	private ArrayList<G> AL = new ArrayList<>();

	public int size() {
		return AL.size();
	}

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public G peek() {
		return AL.get(0);
	}

	public void disp() {
		System.out.println(AL);
	}

	public void add(G ali) {
		AL.add(AL.size(), ali);
		Upheapify(AL.size() - 1);
	}

	private void Upheapify(int child) {
		int parent = (child - 1) / 2;
//		if (AL.get(parent) > AL.get(child)) {
		if (AL.get(parent).compareTo(AL.get(child)) > 0) {
			swap(child, parent);
			Upheapify(parent);
		}
	}

	private void swap(int i, int j) {
		G tem = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, tem);
	}

	public G poll() {
		G ans = AL.get(0);
		AL.set(0, AL.get(AL.size() - 1)); // update the head od the tree to the last value!!
		AL.remove(AL.size() - 1); // remove last element !!
		Downheapify(0);
		return ans;
	}

	private void Downheapify(int parent) {
		int L = parent * 2 + 1;
		int R = parent * 2 + 2;

		int min = parent;
//		if (L < AL.size() && AL.get(L) < AL.get(min)) {
		if (L < AL.size() && AL.get(L).compareTo(AL.get(min)) < 0) {
			min = L;
		}
		if (R < AL.size() && AL.get(R).compareTo(AL.get(min)) < 0) {
			min = R;
		}
		if (min != parent) {
			swap(parent, min);
			Downheapify(min);
		}

	}

}

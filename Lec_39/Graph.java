package Lec_39;

import java.util.HashMap;

public class Graph {
//	HashMap<V<HashMap<nbr,Wt>>>
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int V) {
		map = new HashMap<Integer, HashMap<Integer, Integer>>();
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= V; i++) {
			map.put(i, new HashMap<Integer, Integer>());
		}
//		System.out.println(map);
	}

	public void addEdge(int v1, int v2, int wt) {
		HashMap<Integer, Integer> v1_nbr = map.get(v1);
		v1_nbr.put(v2, wt);

		HashMap<Integer, Integer> v2_nbr = map.get(v2);
		v2_nbr.put(v1, wt);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public void removeEdge(int v1, int v2) {
		HashMap<Integer, Integer> v1_nbr = map.get(v1);
		v1_nbr.remove(v2);

		HashMap<Integer, Integer> v2_nbr = map.get(v1);
		v2_nbr.remove(v1);
	}

	public int NumOfEdge() {
		int size = 0;
		for (int V : map.keySet()) {
			HashMap<Integer, Integer> nbrs = map.get(V);
			size = size + nbrs.size();
		}
		return size/2;
	}
	public void Disp() {
		System.out.println(map);
	}
	
	public boolean hasPath(int src, int dest) {
		
	}
}

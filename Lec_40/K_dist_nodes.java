package Lec_40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class K_dist_nodes {
	public static void main(String[] args) {

	}

	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

	public static void graph(TreeNode nn, HashMap<Integer,HashMap<Integer,Integer>> map) {
		if(nn==null) {
			return;
		}
		if(!map.containsKey(nn.val)) {
			map.put(nn.val, new HashMap<>());
		}
		graph(nn.left,map);
		graph(nn.right,map);
//		create the 4 edges!!
		if(nn.left!=null) {
			map.get(nn.val).put(nn.left.val, 0);
			map.get(nn.left.val).put(nn.val,0);
		}
		if(nn.right!=null) {
			map.get(nn.val).put(nn.right.val, 0);
			map.get(nn.right.val).put(nn.val,0);
		}
	}
	public static void DFS(int V, int K, HashSet<Integer> Visited,  HashMap<Integer,HashMap<Integer,Integer>> map,List<Integer> Ans) {
		if(Visited.contains(V)) {
			return;
		}
		if(K==0) {
			Ans.add(V);
			return;
		}
		Visited.add(V);
		for(int nbr : map.get(V).keySet() ){
				DFS(nbr, K-1, Visited, map,Ans);
		}
	}
	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<Integer,HashMap<Integer,Integer>>();
//        Convert tree to map!!
        graph(root,map);
        List<Integer> Ans = new ArrayList<Integer>();
        DFS(target.val, k, new HashSet<>(), map,Ans);
        return Ans;
        
   }
}

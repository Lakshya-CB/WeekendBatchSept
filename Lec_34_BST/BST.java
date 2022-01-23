package Lec_34_BST;

import java.util.Scanner;

import Lec_32_33_34_BT.BTree;

public class BST extends BTree {

	public boolean find(int ali) {
		return find(root, ali);
	}

	private boolean find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (root.data == ali) {
			return true;
		} else if (root.data > ali) {
			return find(nn.left, ali);
		} else {
			return find(nn.right, ali);
		}
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return max(nn.right);
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data >= ali) {
			nn.left = add(nn.left, ali);
		} else {
			nn.right = add(nn.right, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		remove(root,ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
			return nn;
		} else if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
			return nn;
		} else {
//			case 1: if leaf node!!
			if (nn.right == null && nn.left == null) {
				return null;
			}
//			case 2: if one child
			else if (nn.right == null && nn.left != null) {
				return nn.left;
			} else if (nn.right != null && nn.left == null) {
				return nn.right;
			} else {
//				case 3: both children are present!!
				int maxLST = max(nn.left);
				nn.data = maxLST;
				nn.left = remove(nn.left, maxLST);
				return nn;
			}
		}

	}
}

package Lec_30_31;

import java.util.Stack;

public class LinkedList {
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
//			System.out.print(temp.data+" ");
			temp = temp.next;
			count++;
		}
//		System.out.println();
		return count;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	public void addLast(int data) {
		Node nn = new Node(data);

		if (isEmpty()) {
			head = nn;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
//		now temp.next is null!! so temp is the last Node!!
		temp.next = nn;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node nn = new Node(data);
		nn.next = head;

		head = nn;
	}

	public void addAt(int data, int idx) {
		if (idx == 0) {
			addFirst(data);
		} else if (idx == size()) {
			addLast(data);
		} else {

			Node prev = getNode(idx - 1);
			Node Next = prev.next;

			Node nn = new Node(data);

			prev.next = nn;
			nn.next = Next;
		}
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public int removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		} else if (size() == 1) {
			int ans = head.data;
			head = null;
			return ans;

		}
		Node nn = getNode(size() - 2);
		int ans = nn.next.data;
		nn.next = null;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {
			Node nn = getNode(idx - 1);
			int ans = nn.next.data;
			nn.next = nn.next.next;
			return ans;
		}

	}

	private Node getNode(int idx) {
		if (isEmpty() || idx >= size()) {
			throw new RuntimeException("Kaha deekh rha hein!?");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void rev_itr() {
		Node Curr = head;
		Node prev = null;
		while (Curr != null) {
			Node after = Curr.next;
			// how will you reverse the node?

			Curr.next = prev;

			prev = Curr;
			Curr = after;
		}
		head = prev;
	}

	public void rev_rec1() {
		Node temp = head;
		rev_rec1(head);
		temp.next = null;
	}

	private void rev_rec1(Node prev) {
		if (prev.next == null) {
			head = prev;
			return;
		}

		rev_rec1(prev.next);

//		Node curr = prev.next;
//		curr.next = prev;
		prev.next.next = prev;
	}

	public int midData() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int lastK(int k) {
		Node fast = head;
		while (k > 0) {
			fast = fast.next;
			k--;
		}

//		Torreto!! bhag!! K steps!!
		Node slow = head;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public int InterLL(Node head1, Node head2) {

		Node car1 = head1;
		Node car2 = head2;
		while (car1 != car2) {

			car1 = car1.next;
			car2 = car2.next;

			if (car1 == car2 && car1 == null) {
				return -11;
			}

			if (car1 == null) {
				car1 = head2;
			}
			if (car2 == null) {
				car2 = head1;
			}

		}
		return car1.data;
	}

	public void create() {
		Node head1 = new Node(1);
		Node head2 = new Node(3);
		head1.next = head2;
		System.out.println(InterLL(head1, head2));
	}

	public void revK(int k) {
		Node new_LL_head = null;
		Node new_LL_tail = null;

		Node temp = head;
		Stack<Node> S = new Stack<>();
		while (temp != null) {
			if (S.size() < k) {
				S.add(temp);
			}
//			System.out.println(temp.data);

			temp = temp.next;

			if (S.size() == k || temp == null) {
				while (!S.isEmpty()) {
					Node n = S.pop();
					if (new_LL_tail == null) {
						new_LL_head = n;
						new_LL_tail = n;
					} else {
						new_LL_tail.next = n;
						new_LL_tail = n;
					}
				}
			}
//			temp=temp.next;
		}
		new_LL_tail.next = null;
		head = new_LL_head;
	}

	public boolean isCyclic() {
//		Node nn = new Node(100);
//		Node last =  getNode(size()-1);
//		last.next = nn;
//		nn.next = head;

		Node fast = head;
		Node slow = head;
		
		while ( fast.next != null && fast != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow) {
				return true;
			}
//			System.out.println(fast.data + "  "+ slow.data);
		}
		return false;
		
	}

	public int LoopLen() {

		Node fast = head;
		Node slow = head;
		while (true) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow) {
				break;
			}
		}

		Node nn = slow;
		int loop = 1;
		while (nn.next != slow) {
//			System.out.println(nn.data);
			loop++;
			nn = nn.next;
		}
		return loop;
	}

	public void startingLoop() {
		int L = LoopLen();
		Node C2 = head;
		while (L > 0) {
			C2 = C2.next;
			L--;
		}
		
		Node C1 = head;
		while (C1 != C2) {
			C1 = C1.next;
			C2 = C2.next;
		}
		System.out.println(C1.data);
	}
	public void create_Cyclic() {
		Node nn1 = new Node(10);
		Node nn2 = new Node(20);
		nn1.next = nn2;
		
		Node nn3 = new Node(30);
		nn2.next = nn3;
		
		Node nn4 = new Node(40);
		nn3.next = nn4;
		
		Node nn5 = new Node(50);
		nn4.next = nn5;
		
		Node nn6 = new Node(60);
		nn5.next = nn6;

		Node nn7 = new Node(70);
		nn6.next = nn7;
		
		nn7.next = nn3;
		head = nn1;
	} 
	public void BreakCyclic() {


		Node fast = head;
		Node slow = head;
		
		while ( fast.next != null && fast != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow) {
				break;
			}
		}
		slow=head;
		while(fast.next!=slow.next) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = null;
		return ;
		
	}
	

}

package joesefu;

//约瑟夫问题，有n个人，从1开始报数，报到3的人退出，还剩下哪两个人

public class first {
	public static void main(String[] args) {
		Link l = new Link();

		for (int i = 1; i < 42; i++) {
			l.add(i);
		}

		l.left(3);
	}
}

class Node {
	int val;
	Node next;

	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

class Link {
	Node head = new Node(0, null);
	Node last = head;
	int N = 0;
	public void add(int i) {
		if (N == 0) {
			head.val = i;
			N++;
		} else {
			last.next = new Node(i, head);
			last = last.next;
			N++;
		}
	}
	public Node left(int n) {
		Node temp = last;
		int i = 0;
		while (true) {
			if (N < n) 
				break;
			i++;
			temp=temp.next;
			if (i % (n - 1) == 0) {
				temp.next = temp.next.next;
				N--;
				i = 0;
			}
		}
		return temp;
	}
}

//即使头结点不用也可以，看temp的链表即可一开始看错了，不应该看head或者last
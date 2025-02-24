package table;

public class chartable<key extends Comparable<key>, value> {
	public chartable() {
		head = new Node(null, null, null);
		N = 0;
	}
	
	Node head;
	int N = 0;
	class Node {
		key k;
		value v;
		Node next;

		public Node(key k, value v, Node next) {
			this.k = k;
			this.v = v;
			this.next = next;
		}
	}
	
	public void insert(key k1, value val1) {
		Node n = head.next;
		while (n != null) {
			if (n.k.equals(k1)) {
				n.v = val1;
				return;
			}
			n=n.next;
		}
		head.next=new Node(k1,val1,head.next);
		N++;
	}
	public value get(key k1) {
		Node n=head.next;
		while(n!=null) {
			if(n.k.equals(k1))
				return n.v;
			n=n.next;
		}
		return null;	
	}
	public void delete(key k1) {
		Node pre=head;
		Node curr=head.next;
		
		while(curr!=null) {
			if(curr.k.equals(k1)) {
				pre.next=curr.next;
				return ;
			}
			curr=curr.next;
			pre=pre.next;
		}
	}
}

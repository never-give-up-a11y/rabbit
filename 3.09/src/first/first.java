package first;

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

public class first {
	public static void main(String[] args) {
		Solution S = new Solution();
		ListNode t1 = new ListNode(0, null);
		ListNode t2 = new ListNode(0, null);
		ListNode l1 = t1;
		ListNode l2 = t2;
		for (int i = 0; i < 5; i++) {
			t1.next = new ListNode(9, null);
			t1 = t1.next;
		}
		for (int i = 0; i < 7; i++) {
			t2.next = new ListNode(9, null);
			t2 = t2.next;
		}

		S.addTwoNumbers(l1.next, l2.next);
	}

}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0, null);
		ListNode l = head;
		int temp = 0;
		ListNode t1 = l1;
		ListNode t2 = l2;

		do {
			if (t1 == null) {
				while (t2 != null) {
					l.next = new ListNode((temp + t2.val) % 10, null);
					l = l.next;
					temp = (temp + t2.val) / 10;
					t2 = t2.next;
				}
			}
			if (t2 == null) {
				while (t1 != null) {
					l.next = new ListNode((temp + t1.val) % 10, null);
					l = l.next;
					temp = (temp + t1.val) / 10;
					t1 = t1.next;
				}
			}

			if (t1 != null || t2 != null) {
				l.next = new ListNode((t1.val + t2.val + temp) % 10, null);
				temp = (t1.val + t2.val + temp) / 10;
				t1 = t1.next;
				t2 = t2.next;
				l = l.next;
			}
		} while (t1 != null || t2 != null);
		
		if(temp!=0) 
			l.next=new ListNode(temp, null);
		
		return head.next;
	}
}

//耗时1ms，超过全国100%，数字相加减有进退位，要考虑到这一点，非常重要
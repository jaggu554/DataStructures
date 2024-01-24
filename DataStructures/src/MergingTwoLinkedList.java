public class MergingTwoLinkedList {
	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("Null");
	}

	public static ListNode merge(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (a != null && b != null) {
			if (a.data <= b.data) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = b;
		} else {
			tail.next = a;
		}
		return dummy.next;
	}

	public static ListNode add(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while (a != null || b != null) {
			int x = (a != null) ? a.data : 0;
			int y = (b != null) ? b.data : 0;
			int sum = carry + x + y;
			carry = sum % 10;
			tail.next = new ListNode(sum % 10);
			tail = tail.next;
			if (a != null)
				a = a.next;
			if (b != null)
				b = b.next;

		}
		if (carry > 0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		MergingTwoLinkedList ml = new MergingTwoLinkedList();

		ml.head = new ListNode(0);
		ListNode d1 = new ListNode(1);
		ListNode d2 = new ListNode(2);
		ListNode d3 = new ListNode(6);
		ml.head.next = d1;
		d1.next = d2;
		d2.next = d3;

		// ml.insertLast(100);

		MergingTwoLinkedList mll = new MergingTwoLinkedList();
		mll.head = new ListNode(5);
		ListNode l1 = new ListNode(8);
		ListNode l2 = new ListNode(9);
		mll.head.next = l1;
		l1.next = l2;

		MergingTwoLinkedList result = new MergingTwoLinkedList();
		result.head = merge(ml.head, mll.head);
		ml.display();
		mll.display();
		result.display();
		MergingTwoLinkedList result1 = new MergingTwoLinkedList();
		result1.head = add(ml.head, mll.head);
		result1.display();
	}
}

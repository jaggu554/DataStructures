import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
	private ListNode last;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}

	}

	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void createsALoop() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		last = fourth;
	}

	public void display() {
		if (last == null) {
			return;
		}
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + "-->");
			first = first.next;
		}
		System.out.println(first.data);
	}

	public void insertLast(int value) {
		ListNode temp = new ListNode(value);
		if (last == null) {
			last = temp;
			last.next = last;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}

	public void insertFirst(int value) {
		ListNode temp = new ListNode(value);
		if (last == null) {
			last = temp;
		} else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}

	public ListNode removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("circular linkedlist is empty");
		}
		ListNode temp = last.next;
		if (last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}

	public static void main(String[] args) {
		CircularSinglyLinkedList c1 = new CircularSinglyLinkedList();
		c1.createsALoop();
		c1.display();
		c1.insertFirst(1);
		c1.display();
		c1.insertLast(50);
		c1.display();
		c1.removeFirst();
		c1.display();
	}
}

import java.lang.*;

public class SinglyLinkedList {
	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	// inserting the new value at the begining
	public void insertBegining(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	// displaying the deletelast node
	public ListNode deleteLastNode() {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;

	}

	// displaying the elements in LinkedList
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("Null");
	}

	// displaying the length count in linkedlist
	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	// inserting the value at the end of the linkedList
	public void insertEnd(int value) {
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

	// insert node at the any position
	public void insert(int position, int value) {
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
		}
		int count = 1;
		ListNode previous = head;

		while (count < position - 1) {
			previous = previous.next;
			count++;
		}
		ListNode current = previous.next;
		previous.next = node;
		node.next = current;
	}

	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

//delete the position which we want
	public void delete(int position) {
		if (position == 1) {
			head = head.next;
		}
		ListNode previous = head;
		int count = 1;
		while (count < position - 1) {
			count++;
			previous = previous.next;
		}
		ListNode current = previous.next;
		previous.next = current.next;
	}

	// searching a key value into the linkedlist
	public boolean find(ListNode head, int searchkey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while (current != null) {
			if (current.data == searchkey) {
				return true;
			}
			current = current.next;
		}
		return false;

	}

	// reversing the linkedlist
	public ListNode reverse() {
		if (head == null) {
			return null;
		}

		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public ListNode getMiddleNode() {
		if (head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (slowPtr.next != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		System.out.println(slowPtr);
		return slowPtr;
	}

// getting nth node from the last
	public ListNode getNthNode(int n) {
		if (head == null) {
			return head;
		}
		if (n <= 0) {
			throw new IllegalArgumentException("Invalid value:n= " + n);
		}
		int count = 0;
		ListNode refPtr = head;
		ListNode mainPtr = head;
		while (count < n) {
			refPtr = refPtr.next;
			count++;

		}
		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	public void removeDuplicates() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public ListNode insertInsortedList(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}

	public void deleteNode(int key) {
		ListNode current = head;
		ListNode temp = null;
		if (current != null && current.data == key) {
			head = current.next;
			return;
		}
		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if (current == null) {
			return;
		}
		temp.next = current.next;
	}

	public void createALoop() {
		ListNode f1 = new ListNode(10);
		ListNode f2 = new ListNode(20);
		ListNode f3 = new ListNode(30);
		ListNode f4 = new ListNode(40);
		ListNode f5 = new ListNode(50);
		head = f1;
		f1.next = f2;
		f2.next = f3;
		f3.next = f4;
		f4.next = f5;
		f5.next = f3;
	}

	// checking the loop contains a loop or not
	public boolean containsLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}

	// finding the loop in a linkedlist
	public ListNode startNodeLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}

private ListNode getStartingNode(ListNode slowPtr) {
	ListNode temp=head;
	while(temp!=slowPtr) {
		temp=temp.next;
		slowPtr=slowPtr.next;
		
	}
	return slowPtr;
}
//removing a loop inthe LinkedList
public void removeLoop() {
	ListNode slowPtr=head;
	ListNode fastPtr=head;
	while(slowPtr!=null && fastPtr!=null) {
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
		if(slowPtr==fastPtr) {
			removeLoop(slowPtr);
		}
	}
		
}
private ListNode removeLoop(ListNode slowPtr) {
	ListNode temp=head;
	while(temp.next!=slowPtr.next) {
		temp=temp.next;
		slowPtr=slowPtr.next;
	}
	return slowPtr.next;
}

	public static void main(String[] args) {
		SinglyLinkedList s1 = new SinglyLinkedList();
		s1.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		s1.head.next = second;
		second.next = third;
		third.next = fourth;
		s1.display();
		System.out.println();
		System.out.println(s1.length());
		s1.insertBegining(25);
		s1.insertBegining(24);
		// s1.display();
		s1.insertEnd(45);
		s1.insertEnd(67);
		// s1.display();
		s1.insert(1, 0);
		s1.display();
		s1.deleteFirst();
		s1.deleteFirst();
		System.out.println();
		/*
		 * // s1.display();
		 * 
		 * s1.deleteLastNode(); s1.deleteLastNode(); // s1.display(); s1.delete(2); //
		 * s1.display(); System.out.println(); // System.out.println(s1.find(head, 20));
		 * // System.out.println(s1.reverse(head)); // ListNode rs=s1.reverse(head);
		 * s1.display();
		 * 
		 */
		// s1.display();
		// System.out.println();
		// SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		// System.out.println(singlyLinkedList.reverse(head));
		/*
		 * s1.display(); ListNode midNode = s1.getMiddleNode();
		 * System.out.println(midNode.data);
		 */
		// System.out.println(s1.getMiddleNode().data);
		ListNode nthNode = s1.getNthNode(3);
		System.out.println(nthNode.data);
		s1.deleteFirst();
		s1.deleteFirst();
		s1.deleteFirst();
		s1.deleteFirst();
		s1.deleteFirst();
		s1.deleteFirst();
		s1.deleteFirst();
		s1.insertBegining(1);
		s1.insertBegining(1);
		s1.insertEnd(2);
		s1.insertEnd(2);
		s1.insertEnd(3);
		s1.display();
		s1.removeDuplicates();
		System.out.println();
		s1.display();
		s1.insertInsortedList(4);
		System.out.println();
		s1.display();
		s1.delete(3);
		System.out.println();
		s1.display();
		s1.createALoop();
		System.out.println();
		//System.out.println(s1.containsLoop());
		//System.out.println(s1.startNodeLoop().data);
		s1.removeLoop();
		
		//System.out.println(s1.startNodeLoop().data);
		//System.out.println(s1.containsLoop());
	}

}
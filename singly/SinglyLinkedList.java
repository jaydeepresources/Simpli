package singly;

public class SinglyLinkedList {

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data);

		
		if (head == null) {
			
			head = newNode;
			tail = newNode;
		} else {
			
			tail.next = newNode;
			
			tail = newNode;
		}
	}

	public void display() {
		
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			
			System.out.print(current.data + " ");
			System.out.println("Next= " + current.next.data);
			current = current.next;
		}
		System.out.println();
	}

}
package com.pkg.linkedList;

public class ReverseLinkedList {
	
	private static Node reverseLinkedList(Node head){
		Node prev = null;
		if(head == null)
			return prev;
		
		while(head != null){
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		LinkedListOperations.insertNode();
		Node prev = reverseLinkedList(LinkedListOperations.head);
		LinkedListOperations.printList(prev);
	}

}

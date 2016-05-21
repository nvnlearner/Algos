package com.pkg.linkedList;

public class DetectLoop {

	
	private static void detectLoop(Node head){
		
		if(head == null)
			return;
		Node ptr1 = head;
		Node ptr2 = head;
		while(ptr1 != null && ptr2 != null){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			
			if(ptr1 == ptr2){
				System.out.println("Loop found : " + ptr1.data );
				return;
			}
		}
		System.out.println("No Loop found");
	}
	
	public static void main(String[] args) {
		LinkedListOperations.insertNode();
		detectLoop(LinkedListOperations.head);
	}

}

package com.pkg.linkedList;

public class Merge2SortedLists {

	private static Node result;
	private static Node mergeLists(Node head1, Node head2){
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		if(head1.data <= head2.data){
				result = head1;
			result.next = mergeLists(head1.next, head2);
		} else {
				result = head2;
				result.next = mergeLists(head1, head2.next);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		LinkedListOperations.insertNode();
		LinkedListOperations.insertNode1();
		mergeLists(LinkedListOperations.head, LinkedListOperations.head1);
		LinkedListOperations.printList(result);
	}

}

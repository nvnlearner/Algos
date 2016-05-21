package com.pkg.linkedList;

public class ReverseKNodesList {

	//9, 17, 18, 25, 2, 3, 7, 19
	private static Node reverseKNodes(Node head, int k){
		Node next = null;
		Node prev = null;
		Node current = head;
		int count = 0;
			while(count < k && current != null){
				 next = current.next;
				 current.next = prev;
				prev = current;
				current = next;
				count++;
			}
			if(next != null){
				System.out.println(next.data);
				/** head remains the same when reversed so the recursive return should be attached to head.next
				 * it should be head->next only.
					when you reversed 1->2->3 part it will become 3->2->1, 
					so node having value as 1 should be pointing to the node returned by the recursive function, 
					which is head in this case
				 */
				head.next = reverseKNodes(next, k);
			}
				
			return prev;
	}
	
	
	public static void main(String[] args) {
		LinkedListOperations.insertNode();
		Node v = reverseKNodes(LinkedListOperations.head, 3);
		LinkedListOperations.printList(v);
	}

}

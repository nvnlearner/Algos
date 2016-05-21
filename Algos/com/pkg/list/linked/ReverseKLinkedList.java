package com.pkg.list.linked;


class Node {
	int data;
	Node next;
}

public class ReverseKLinkedList {

	private static Node head = null;
	
	private static void insert(int data){
		Node node = new Node();
		if(head == null){
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	private static void reverseKNodes(int k){
		
		
		
	}
	
	
	public static void main(String[] args) {

	}

}

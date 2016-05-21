package com.pkg.linkedList;


class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
}

public class LinkedListOperations {
	public static Node head;
	public static Node head1;
	private static int[] input = {9, 17, 18, 25, 2, 3, 7, 19};
	private static int[] input1 = {2, 3, 7, 19};
	public static void insertNode(){
		for(int i =0; i< input.length; i++){
			insertHead(input[i]);
		}
		//head.next.next.next.next = head;
		printList(head);
	}
	
	public static void insertNode1(){
		for(int i =0; i< input1.length; i++){
			insertHead1(input1[i]);
		}
		//head.next.next.next.next = head;
		printList(head1);
	}
	
	private static void insertHead1(int data) {
		Node newNode = new Node(data);
		if(head1 == null){
			head1 = newNode;
		} else{
			newNode.next = head1;
			head1 = newNode;
		}
	}
	
	private static void insertHead(int data) {
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		} else{
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	public static void printList(Node current){
		
		if(current == null) System.out.println("List is null"); 
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

	}

}

package com.pkg.binary.trees.niceconcepts;


class Node{
	
	Node left = null;
	Node right = null;
	int data ;
	
	public Node(int data){
		this.data = data;
	}
	
}


public class LowestCommonAncestor {
	
	static Node root = null;
	static Node current = null;
	
	static int[] input = {12, 16, 9, 10, 7, 3, 8, 14,19};
	
	public static void insert(int data){
		Node newNode = new Node(data);
		
		if(root == null)
			root = newNode;
		
		else{
			current = root;
			Node parent = current; 
			while (true) {

				if (current.data > data) {

					if (current.left == null) {
						parent.left = newNode;
						break;
					}
					current = current.left;
				} else {
					if (current.right == null) {
						parent.right = newNode;
						break;
					}
					current = current.right;
				}

				parent = current;
			}
			
		}
	}
	
	public static Node findCommonAncestor(Node root, int n1, int n2){
		
		if(root == null)
			return root;
		
		if(root.data > n1 && root.data > n2)
		return findCommonAncestor(root.left, n1, n2);
		
		if(root.data < n1 && root.data < n2)
			return findCommonAncestor(root.right, n1, n2);
		
		return root;
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < input.length; i++) {
			insert(input[i]);
		}
		
		printInorder(root);
		System.out.println();
		
		System.out.println("LCA of Tree : " + findCommonAncestor(root, 7, 10).data);
	}

	private static void printInorder(Node current) {
		
		if(current == null)
			return;
		
		printInorder(current.left);
		System.out.print(current.data + " ");
		printInorder(current.right);
		
	}

}

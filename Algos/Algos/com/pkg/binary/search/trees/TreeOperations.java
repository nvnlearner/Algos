package com.pkg.binary.search.trees;


class TreeNode {
	TreeNode left;
	TreeNode right;
	int h;
	int data;

	public TreeNode(int data) {
		this.data = data;
	}
}

public class TreeOperations {
	static TreeNode root;
	static TreeNode root1;
	public static int[] input = { 10, 30, 20, 15, 5};//5,1,0,4,10, 7,9
	public static int[] input1 = { 10,4,20, 7,9 };

	public static void insert(int data) { //, TreeNode root
		TreeNode node = new TreeNode(data);
		if (root == null)
			root = node;
		else {
			TreeNode current = root;
			while (true) {
				if (node.data < current.data) {
					if (current.left == null) {
						current.left = node;
						break;
					}
					current = current.left;
				} else {
					if (current.right == null) {
						current.right = node;
						break;
					}
					current = current.right;
				}
			}
		}
	}

	public static void printBinaryTree(TreeNode root, int level) {
		if (root == null)
			return;
		printBinaryTree(root.right, level + 1);
		if (level != 0) {
			for (int i = 0; i < level - 1; i++)
				System.out.print("|\t");
			System.out.println("|-------" + root.data);
		} else
			System.out.println(root.data);
		printBinaryTree(root.left, level + 1);
	}

	private void delete() {

	}

	private static void inOrder(TreeNode node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	private static void preOrder(TreeNode node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	private static void postOrder(TreeNode node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public static int height(TreeNode root) {
		if (root == null)
			return 0;

		return Math.max(height(root.left), height(root.right)) + 1;
	}

	private static int size(TreeNode root) {
		if (root == null)
			return 0;

		return size(root.left) + size(root.right) + 1;
	}

	public static void insert(){
	     for (int s = 0; s < input.length; s++) {
	    	 insert(input[s]);
		}
	     printBinaryTree(root, 0);
	     System.out.println();
	}
	public static void insert1(){
	     for (int s = 0; s < input1.length; s++) {
	    	 //insert(input1[s], root1);
		}
	}
	public static void main(String[] args) {

		    
		     printBinaryTree(root, 0);
			/*inOrder(root);
			System.out.println();
			preOrder(root);
			System.out.println();
			postOrder(root);
			System.out.println();
			System.out.println(height(root));
			System.out.println(size(root));*/
	}

}

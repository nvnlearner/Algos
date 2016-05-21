package com.pkg.binary.trees;




class TreeNode {

	TreeNode left = null;
	TreeNode right = null;
	int height;
	int data;

	public TreeNode(int data) {
		this.data = data;
	}

}

public class TreeOperations {

	static TreeNode root = null;
	static TreeNode root1 = null;
	static TreeNode current = null;
	static int[] input = { 50, 20, 70, 10, 30, 25};
	static int[] input1 = { 50, 20, 70, 10, 30};
	static int lSum = 0;
	static int rSum = 0;
	static int increment = 0;
	static int gsum=0;
	
     public static boolean hasSum1(TreeNode root,int sum,int gSum){
		
		if(root == null)return false;
		gSum = gSum+root.data;
		if(gSum == sum && root.left == null && root.right == null)
		{
			return true;
			
		}
		
		hasSum1(root.left, sum ,gSum);
		hasSum1(root.right, sum,gSum);
		return false;
	}
	
	public static boolean hasSum(TreeNode node, int sum) {

		if (node == null)
			return false;

		boolean ans = false;

		int subSum = sum - node.data;

		if (subSum == 0 && node.left == null && node.right == null)
			return true;

		if (node.left != null)
			ans = ans || hasSum(node.left, subSum);
		if (node.right != null)
			ans = ans || hasSum(node.right, subSum);
		return ans;
	}
	
	public static void insert(int data) {
		TreeNode newNode = new TreeNode(data);

		if (root == null)
			root = newNode;

		else {
			current = root;
			TreeNode parent = current;
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
	
	public static void insert1(int data) {
		TreeNode newNode = new TreeNode(data);

		if (root1 == null)
			root1 = newNode;

		else {
			current = root1;
			TreeNode parent = current;
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

	public static void insert(){
		
		for (int i = 0; i < input.length; i++) {
			insert(input[i]);
		}
		printBinaryTree(root, 0);
		System.out.println();
	}
	
	public static void insert1(){
		
		for (int i = 0; i < input1.length; i++) {
			insert1(input1[i]);
		}
		printBinaryTree(root1, 0);
		System.out.println();
	}
	
	public static void printBinaryTree(TreeNode root, int level){
		
	    if(root==null)
	         return;
	    printBinaryTree(root.right, level+1);
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.data);
	    }
	    else
	        System.out.println(root.data);
	    printBinaryTree(root.left, level+1);
	} 
	
	public static void delete(TreeNode current, int value){
		if(current == null) return;
		TreeNode parent = current; 
		while(current != null){
			if(current.data == value){
				
				if(current.left == null && current.right == null){
					parent.left = null;
					parent.right = null;
				}
				
				if(current. left != null){
					parent.left = current.left;
				}
				
				if(current.right != null){
					parent.right = current.right;
				}
				
			}
			
			if(current.data > value){
				parent = current;
				current = current.left;
			}
			else{
				parent = current;
				current = current.right;
			}
		}
		
	}
	
	public static void preOrder(TreeNode current) {
		if (current == null)
			return;
		System.out.print(current.data + " ");
		preOrder(current.left);
		preOrder(current.right);
	}

	public static void inOrder(TreeNode current) {
		if (current == null)
			return;
		inOrder(current.left);
		System.out.print(current.data + " ");
		inOrder(current.right);
	}

	public static void postOrder(TreeNode current) {
		if (current == null)
			return;
		postOrder(current.left);
		postOrder(current.right);
		System.out.print(current.data + " ");
	}

	public static int height(TreeNode current){
		
		if(current== null)
			return 0;
		
		return Math.max(height(current.left), height(current.right))+1;
	}
	
	public static int size(TreeNode current){
		if(current== null)
			return 0;
		return size(current.left)+size(current.right)+1;
	}
	
	public static void main(String[] args) {
		

		
	}

}

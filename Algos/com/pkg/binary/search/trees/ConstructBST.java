package com.pkg.binary.search.trees;

public class ConstructBST {

	
	static int[] nodes;
	private static TreeNode constructBinaryTree(TreeNode root, TreeNode newRoot){
		
		if(root == null)
			return null;
		int size = getSize(root);
		 nodes = new int[size];
		traverseTree(root);
		quickSort(0, nodes.length-1);
		newRoot = constructBSTUtil(newRoot, 0, nodes.length-1);
		return newRoot;
	}
	static int i =0;
	private static void traverseTree(TreeNode root) {
		if(root == null)
			return;
		nodes[i++] = root.data;
		traverseTree(root.left);
		traverseTree(root.right);
	}
	private static int getSize(TreeNode root) {
		
		if(root == null)
			return 0;
		return getSize(root.left)+getSize(root.right)+1;
	}
	
	private static void quickSort(int low, int high){
		int pivot = nodes[low+(high-low)/2];
		int i = 0, j = high;
		if(low <= high){
			while(nodes[i] < pivot)
				i++;
			while(nodes[j] > pivot)
				j--;
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
			if(i<=j){
				quickSort(low, j);
				quickSort(j, high);
			}
		}
	}
	
	static TreeNode parent;
	private static TreeNode constructBSTUtil(TreeNode root, int low, int high){
		if(low > high)
			return null;
		int mid = low+(high-low)/2;
		root = new TreeNode(nodes[mid]);		
		root.left = constructBSTUtil(root, low, mid-1);
		root.right = constructBSTUtil(root, mid+1, high);
		return root;
	}
	
	private static void swap(int i, int j) {
		int temp = nodes[i];
		nodes[i] = nodes[j];
		nodes[j] = temp;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(30);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.right.right = new TreeNode(5);
		System.out.println();
		TreeOperations.printBinaryTree(root, 0);
		System.out.println();
		TreeOperations.printBinaryTree(constructBinaryTree(root, null), 0);
	}

}

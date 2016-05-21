package com.pkg.binary.trees;

public class MaxMinElement {
	
	
	//doubts to be cleared
	private static int maxElement(TreeNode root){
		if(root == null)
			return Integer.MIN_VALUE;
		int res = root.data;
		int l = maxElement(root.left);
		int r = maxElement(root.right);
		
		if(l > res)
			res = l;
		if(r > res)
			res = r;
		System.out.println("res : " +res);
		return res;
	}

	public static void main(String[] args) {
		
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(12);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.right.left = new TreeNode(32);
		TreeOperations.root.left.left = new TreeNode(18);
		TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		System.out.println(maxElement(TreeOperations.root));
	}

}

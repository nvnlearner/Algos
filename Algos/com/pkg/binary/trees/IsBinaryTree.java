package com.pkg.binary.trees;

public class IsBinaryTree {
	
	private static boolean isBinaryUtil(TreeNode root){
		
		int count = size(root);
		System.out.println(count);
		return isBinaryTree(root, 0, count);
	}
	

	private static int size(TreeNode root) {
		if(root == null)
			return 0;
		return size(root.left)+ size(root.right)+1;
	}


	private static boolean isBinaryTree(TreeNode root, int index, int count) {
		if (root == null)
			return true;
		
		System.out.println("index : " + index +"count: "+ count);
		if (index >= count)
			return false;
		
		return isBinaryTree(root.left, 2 * index + 1, count) &&
		isBinaryTree(root.right, 2 * index + 2, count);
	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(26);
		TreeOperations.root.left = new TreeNode(10);
		TreeOperations.root.right = new TreeNode(3);
		TreeOperations.root.right.left = new TreeNode(3);
		TreeOperations.root.left.left = new TreeNode(4);
		TreeOperations.root.left.right = new TreeNode(6);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(isBinaryUtil(TreeOperations.root));
	}

}

package com.pkg.binary.trees;

public class ConvertChildrenSumTree {

	
	private static void convertTree(TreeNode root){
		
		if(root == null)
			return;
		convertTree(root.left);
		convertTree(root.right);
		
		if(root.left != null)
			root.data = root.left.data;
		if(root.right != null)
			root.data += root.right.data;
	}
	
	
	public static void main(String[] args) {
		//TreeOperations.insert();
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(18);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.right.left = new TreeNode(12);
		TreeOperations.root.left.left = new TreeNode(32);
		TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		convertTree(TreeOperations.root);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
	}

}

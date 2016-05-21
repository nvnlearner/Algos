package com.pkg.binary.trees;

public class BinaryTreeDiameter {

	private static int BTDiameter(TreeNode root){
		if(root == null)
			return 0;
		int left = height(root.left);
		int right = height(root.right);
		return left+right;
	}
	
	
	
	
	
	private static int height(TreeNode root) {
		if(root == null) return 0;
		
		return 1+Math.max(height(root.left), height(root.right));
	}

	public static void main(String[] args) {
		//TreeOperations.insert();
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(18);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.left.left = new TreeNode(32);
		TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		System.out.println(BTDiameter(TreeOperations.root));
	}

}

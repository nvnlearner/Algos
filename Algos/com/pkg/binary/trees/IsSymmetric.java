package com.pkg.binary.trees;

public class IsSymmetric {

	private static boolean isSymetric(TreeNode root1, TreeNode root2) {

		if (root1 == null && root2 == null)
			return true;
		
		if(root1 != null && root2 == null || (root2 != null && root1 == null))
			return false;

		return isSymetric(root1.left, root2.right) && 
				isSymetric(root1.right, root2.left);

	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(4);
		TreeOperations.root.right = new TreeNode(4);
		TreeOperations.root.right.right = new TreeNode(6);
		TreeOperations.root.left.right = new TreeNode(6);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(isSymetric(TreeOperations.root.left, TreeOperations.root.right));
		
	}

}

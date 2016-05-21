package com.pkg.binary.trees;

/*
 * http://www.geeksforgeeks.org/double-tree/
 */
public class DoubleTree {

	private static void doubleTree(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			root.left = new TreeNode(root.data);
			return;
		}
		TreeNode left = null;
		TreeNode right = null;
		if (root.left != null)
			left = root.left;
		if (root.right != null)
			right = root.right;

		root.left = new TreeNode(root.data);
		root.left.left = left;
		root.right = right;
		doubleTree(root.left.left);
		doubleTree(root.right);

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		doubleTree(root);
		TreeOperations.printBinaryTree(root, 0);
	}

}

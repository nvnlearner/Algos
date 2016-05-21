package com.pkg.binary.trees;

/*
 * http://geeksquiz.com/change-a-binary-tree-so-that-every-node-stores-sum-of-all-nodes-in-left-subtree/
 */

public class UpdateLeftNodes {

	private static int updateNodes(TreeNode root) {

		if (root == null)
			return 0;
		
		if(root.left == null && root.right == null) //not sure why it should be used
			return root.data;
		
		int left = updateNodes(root.left);
		int right = updateNodes(root.right);
		root.data += left;
		return root.data + right;
	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(1);
		TreeOperations.root.left = new TreeNode(2);
		TreeOperations.root.right = new TreeNode(3);
		TreeOperations.root.right.right = new TreeNode(4);
		TreeOperations.root.left.left = new TreeNode(5);
		TreeOperations.root.left.right = new TreeNode(6);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		updateNodes(TreeOperations.root);
		System.out.println();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
	}

}

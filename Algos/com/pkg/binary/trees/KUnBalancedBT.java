package com.pkg.binary.trees;

/*
 * http://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
 */

public class KUnBalancedBT {

	static boolean isBalanced = true;
	private static int kUnBalancedNode(TreeNode root, int k) {

		if(root == null)
			return 0;
		
		int l = kUnBalancedNode(root.left, k)+1;
		int r = kUnBalancedNode(root.right, k)+1;
		
		if (Math.abs(l - r) > k ){
			isBalanced = false;
		}
		return Math.max(l, r);
	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(5);
		TreeOperations.root.left = new TreeNode(3);
		TreeOperations.root.right = new TreeNode(25);
		TreeOperations.root.right.left = new TreeNode(15);
		TreeOperations.root.right.left.right = new TreeNode(11);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(kUnBalancedNode(TreeOperations.root, 1));
		System.out.println(isBalanced);
	}

}

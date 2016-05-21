package com.pkg.binary.search.trees;

public class MirrorTree {

	private static void mirrorTree(TreeNode root) {

		if (root == null)
			return;
		mirrorTree(root.left);
		mirrorTree(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}

	public static void main(String[] args) {
		for (int i = 0; i < TreeOperations.input.length; i++) {
			TreeOperations.insert(TreeOperations.input[i]);
		}
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		System.out.println();
		mirrorTree(TreeOperations.root);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
	}

}

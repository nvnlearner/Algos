package com.pkg.binary.search.trees;

public class PrintAllPathRootToLeaf {

	static int[] values;

	private static void printPaths(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		values[level] = root.data;
		if (root.left == null && root.right == null) {
			for (int i = 0; i < values.length; i++) {
				System.out.print(values[i] + " ");

			}
			System.out.println();
		}
		else{
			printPaths(root.left, level + 1);
			printPaths(root.right, level + 1);
		}
	}

	private static int height(TreeNode root) {

		if (root == null)
			return 0;

		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public static void main(String[] args) {
		TreeOperations.insert();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		int level = height(TreeOperations.root);
		values = new int[level];
		printPaths(TreeOperations.root, 0);
	}
}

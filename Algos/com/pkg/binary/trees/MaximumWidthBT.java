package com.pkg.binary.trees;

public class MaximumWidthBT {

	static int[] count;
	static int maxVal;
	private static int maxWidthBT(TreeNode root,int level){
		if(root == null)
			return maxVal;
		count[level]++;
		if(count[level] > maxVal)
			maxVal = count[level];
		maxWidthBT(root.left, level+1);
		maxWidthBT(root.right, level+1);
		return maxVal;
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
		int h = TreeOperations.height(TreeOperations.root);
		count = new int[h];
		System.out.println(maxWidthBT(TreeOperations.root, 0));
	}

}

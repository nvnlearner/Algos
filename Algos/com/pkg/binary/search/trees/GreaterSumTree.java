package com.pkg.binary.search.trees;

public class GreaterSumTree {
	
	static int sum;
	
	private static void greaterSumTree(TreeNode root){
		
		if(root == null)
			return ;
		greaterSumTree(root.right);
		sum +=root.data;
		root.data = sum-root.data;
		
		greaterSumTree(root.left);
	}

	public static void main(String[] args) {
		TreeOperations.insert();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		greaterSumTree(TreeOperations.root);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
	}

}

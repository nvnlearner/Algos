package com.pkg.binary.trees;

public class CountLeafNodes {

	private static int countLeafNodes(TreeNode root){
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		else
			return countLeafNodes(root.left) + countLeafNodes(root.right);
	}
	
	public static void main(String[] args) {
		TreeOperations.insert();
		System.out.println(countLeafNodes(TreeOperations.root));
	}

}

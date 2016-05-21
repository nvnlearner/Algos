package com.pkg.binary.search.trees;

public class Test {

	private static TreeNode print(TreeNode root){
		
		if(root == null)
			return null;
		
		root.left = print(root.left);
		root.right = print(root.right);
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeOperations.insert();
		print(TreeOperations.root);
	}

}

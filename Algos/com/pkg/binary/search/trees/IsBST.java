package com.pkg.binary.search.trees;

public class IsBST {

	
	private static boolean isBST(TreeNode root, int min, int max){
		if(root == null)
			return true;
		System.out.println("root.data " + root.data + " min " + min + " max " +max );
		if(root.data < min || root.data > max)
			return false;
		
		return isBST(root.left, min, root.data-1) && isBST(root.right, root.data +1, max);
	}
	public static void main(String[] args) {
			//TreeOperations.insert();
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(5);
		TreeOperations.root.left.left = new TreeNode(2);
		TreeOperations.root.left.right = new TreeNode(7);
		TreeOperations.root.right = new TreeNode(25);
		TreeOperations.root.left.right.left = new TreeNode(2);
		TreeOperations.root.left.right.right = new TreeNode(15);
			System.out.println(isBST(TreeOperations.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

}

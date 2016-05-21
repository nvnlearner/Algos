package com.pkg.binary.trees;

public class FoldableTree {

	
	private static boolean isFoldable(TreeNode root){
		
		if(root.left == null && root.right == null)
			return true;
		if(root.left == null || root.right == null)
			return false;
		return isFoldableUtil(root.left, root.right);
	}
	
	private static boolean isFoldableUtil(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		
		if((root1.left != null && root2.right != null) || (root1.right != null && root2.left != null) 
				|| (root1.left == null && root2.right == null) || (root1.right == null && root2.left == null))
			return isFoldableUtil(root1.left, root2.right) && isFoldableUtil(root1.right, root2.left);
		else
			return false;
	}
	
	public static void main(String[] args) {
		//TreeOperations.insert();
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(18);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.right.right = new TreeNode(12);
		TreeOperations.root.left.left = new TreeNode(32);
		//TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(isFoldable(TreeOperations.root));
	}

}

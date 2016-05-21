package com.pkg.binary.trees;

public class ChildrenSumProperty {

	
	private static boolean checkChildrenSum(TreeNode root){
		
		if(root == null)
			return true;
		
		int left = 0 , right = 0;
		if(root.left != null)
			 left = root.left.data;
		
		if(root.right != null)
			 right = root.right.data;
		
		if(root.data == left+right || (root.left == null && root.right == null))
			return checkChildrenSum(root.left) && checkChildrenSum(root.right);
		else
		return false;
	}
	public static void main(String[] args) {
		//TreeOperations.insert();
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(8);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.right.left = new TreeNode(2);
		TreeOperations.root.left.left = new TreeNode(3);
		TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(checkChildrenSum(TreeOperations.root));
	}

}

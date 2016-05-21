package com.pkg.binary.trees;

public class DoubleTree {

	
	private static void doubleTree(TreeNode root){
			if(root == null) return;
			if(root.left == null && root.right == null){
				root.left = new TreeNode(root.data);
				return;
			}
		
		if(root.left != null){
			TreeNode temp = root.left;
			root.left = new TreeNode(root.data);
			root.left.left = temp;
			doubleTree(root.left.left);
		}
		
		if(root.right != null) {
			doubleTree(root.right.right);
		}
	}
	
	public static void main(String[] args) {
		TreeOperations.insert();
		doubleTree(TreeOperations.root);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
	}

}

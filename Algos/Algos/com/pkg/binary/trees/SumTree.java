package com.pkg.binary.trees;

public class SumTree {

	private static boolean isSumTree(TreeNode root){
		if(root == null)
			return true;
		
		isSumTree(root.left);
		isSumTree(root.right);
		int sum = 0;
		if(root.left != null)
			sum+=root.left.data;
		if(root.right != null)
			sum+=root.right.data;
		
		if( root.left == null && root.right == null)
			return true;
		else if(sum == root.data){
			root.data += sum;	
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		//TreeOperations.insert();
		TreeOperations.root = new TreeNode(26);
		TreeOperations.root.left = new TreeNode(10);
		TreeOperations.root.right = new TreeNode(3);
		TreeOperations.root.right.left = new TreeNode(3);
		TreeOperations.root.left.left = new TreeNode(4);
		TreeOperations.root.left.right = new TreeNode(6);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(isSumTree(TreeOperations.root));
	}

}

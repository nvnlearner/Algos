package com.pkg.binary.search.trees;

public class DeleteKSum {

	static TreeNode parent = null;
	private static TreeNode deleteNodes(TreeNode root, int k, int sum){
		
		if(root == null)
			return null;
		 parent = root;
		sum+=root.data;
		root.left = deleteNodes(root.left, k, sum);
		if(root != null && root.left != null)
			System.out.println("left : " +root.left.data);
		root.right = deleteNodes(root.right, k, sum);
		if(root != null && root.right != null)
			System.out.println("right : " +root.right.data);
		if(sum < k){
			parent = null;
			TreeOperations.printBinaryTree(TreeOperations.root, 0);
		}
		
		return parent;
	}
	
	
	public static void main(String[] args) {
		TreeOperations.insert();
		deleteNodes(TreeOperations.root, 20, 0);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
	}

}

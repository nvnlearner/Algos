package com.pkg.binary.trees;

public class LevelofNode {
	
	private static int getLevelOfNode(TreeNode root, int level, TreeNode k){
		
		if(root == null)
			return 0;
		if(k.data == root.data)
			return level;
		
		
		int l = getLevelOfNode(root.left, level+1, k) ;
		if(l != 0)
			return l;
		 l = getLevelOfNode(root.right, level+1, k);
		 
		 return l;
	}
	

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(18);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.right.left = new TreeNode(12);
		TreeOperations.root.left.left = new TreeNode(32);
		TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		System.out.print(getLevelOfNode(TreeOperations.root, 0, new TreeNode(12)));
	}

}

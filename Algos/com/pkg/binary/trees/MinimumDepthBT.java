package com.pkg.binary.trees;

public class MinimumDepthBT {
	
	private static int minDepth(TreeNode root){
		if(root == null)
			return 0;
	    // Base case : Leaf Node. This accounts for height = 1.
	    if (root.left == null && root.right == null)
	       return 1;
	  
	    
	    /*
	     * Handles case of skewed tree 
	     */
	    // If left subtree is NULL, recur for right subtree
	    if (root.left == null) 
	       return minDepth(root.right) + 1;
	  
	    // If right subtree is NULL, recur for right subtree
	    if (root.right == null)
	       return minDepth(root.left) + 1;
	    
		return Math.min(minDepth(root.left), minDepth(root.right))+1;
	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(26);
		TreeOperations.root.left = new TreeNode(10);
		//TreeOperations.root.right = new TreeNode(3);
		//TreeOperations.root.right.left = new TreeNode(3);
		TreeOperations.root.left.left = new TreeNode(4);
		//TreeOperations.root.left.right = new TreeNode(6);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(minDepth(TreeOperations.root));
	}

}

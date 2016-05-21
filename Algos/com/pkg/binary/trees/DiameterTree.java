package com.pkg.binary.trees;


//TODO : http://www.geeksforgeeks.org/diameter-of-a-binary-tree/
public class DiameterTree {
	
	static int max; static int l; static int r;
	private static int diameterTree(TreeNode root){
		
		if(root.left == null )
			return 0;
		 l = diameterTree(root.left)+1;
		if(root.right == null)
			return 0;
		 r = diameterTree(root.right)+1;
		
		System.out.println("l : " + l + " r : " + r);

		if(max < Math.abs(l+r))
			max = Math.abs(l+r);
		return max;
	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(8);
		TreeOperations.root.right = new TreeNode(2);
		TreeOperations.root.right.left = new TreeNode(2);
		TreeOperations.root.left.left = new TreeNode(3);
		TreeOperations.root.left.right = new TreeNode(5);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(diameterTree(TreeOperations.root));
	}

}

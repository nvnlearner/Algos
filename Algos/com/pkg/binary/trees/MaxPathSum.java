package com.pkg.binary.trees;

public class MaxPathSum {
	
	private static int resVal;
	private static int getMaxSumPath(TreeNode root, int res){
		
		if(root == null)
			return 0;
		
		int l = getMaxSumPath(root.left, resVal); //leftsum
		int r = getMaxSumPath(root.right, resVal); //rightsum
		
		int max = Math.max(Math.max(l, r)+root.data, root.data); //root / left+data or right +data 

		int maxTop = Math.max(max, l+r+root.data); //path max 
		System.out.println(" maxTop : "+ maxTop);
		resVal = Math.max(resVal, maxTop); // when all values are -ve including root expect one node 
		System.out.println("resVal : " + resVal);
		return max;
	}

	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(-26);
		TreeOperations.root.left = new TreeNode(10);
		TreeOperations.root.right = new TreeNode(-3);
		TreeOperations.root.right.left = new TreeNode(-3);
		TreeOperations.root.left.left = new TreeNode(-4);
		TreeOperations.root.left.right = new TreeNode(-6);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(getMaxSumPathUtil(TreeOperations.root));
	}

	private static int getMaxSumPathUtil(TreeNode root) {
		getMaxSumPath(root, Integer.MIN_VALUE);
		return resVal;
	}

}

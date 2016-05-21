package com.pkg.binary.trees;

public class RootToLeafSum {

	private  static void rootToLeafSum(TreeNode root){
		if(root == null)
			return ;
		int height = height(root);
		int[] array = new int[height];
		rootToLeafSumUtil(array, root, 0);
	}
	
	private static void rootToLeafSumUtil(int[] array, TreeNode root, int level) {
		if(root.left == null && root.right == null){
			array[level] = root.data;
			for (int i = 0; i < array.length; i++) {
				if(array[i] != 0)
				System.out.print(array[i]+" ");
			}
			System.out.println();
			return;
		}
		array[level] = root.data;
		rootToLeafSumUtil(array, root.left, level+1);
		rootToLeafSumUtil(array, root.right, level+1);
	}

	private static int height(TreeNode root) {
		if(root == null)
		return 0;
		else
			return 1+Math.max(height(root.left),height(root.right));
	}

	public static void main(String[] args) {
		TreeOperations.insert();
		rootToLeafSum(TreeOperations.root);
	}

}

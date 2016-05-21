package com.pkg.binary.trees;

public class BalancedBinaryTree {
	static boolean l = true,r=true;
	private static boolean isBalancedBST(TreeNode root, int lHeight, int rHeight){
		if(root == null){
			return true;
		}
		if(Math.abs(lHeight-rHeight) > 1)
			return false;
		if(l&&r){
			lHeight+=1; 
			l = isBalancedBST(root.left, lHeight, rHeight);
			r = isBalancedBST(root.right, lHeight, rHeight);
			rHeight+=1;
		}
		return l&&r;
	}

	public static void main(String[] args) {
		TreeOperations.insert();
		System.out.println(isBalancedBST(TreeOperations.root, 0, 0));
	}

}

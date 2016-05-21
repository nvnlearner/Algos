package com.pkg.binary.trees;

public class AncestorsOfNode {

	private static boolean ancestorNodes(TreeNode root, int k){
		
		if(root == null)
			return false;
		
		if(root.data == k)
			return true;
		
		if(ancestorNodes(root.left, k) || ancestorNodes(root.right, k)){
			System.out.println(root.data + " ");
			return true;
		}
		else
			return false;
		
	}
	public static void main(String[] args) {
		TreeOperations.insert();
		ancestorNodes(TreeOperations.root, 25);
	}

}

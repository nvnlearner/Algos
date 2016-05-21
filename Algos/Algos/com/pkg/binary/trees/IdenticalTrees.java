package com.pkg.binary.trees;

public class IdenticalTrees {

	
	private static boolean isIdenticalTrees(TreeNode root1, TreeNode root2){
		
		if(root1 == null && root2 == null){
			return true;
		}
		
		if(root1 != null && root2 != null && root1.data == root2.data)
			return isIdenticalTrees(root1.left, root2.left) && isIdenticalTrees(root1.right, root2.right);
		else
		   return false;
	}
	public static void main(String[] args) {
		TreeOperations.insert();
		//TreeOperations.insert1();
		System.out.println(isIdenticalTrees(TreeOperations.root, TreeOperations.root));
	}
}

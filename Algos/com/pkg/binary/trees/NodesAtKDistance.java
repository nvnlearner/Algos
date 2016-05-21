package com.pkg.binary.trees;

public class NodesAtKDistance {

	
	private static void nodesAtDistance(TreeNode root, int k, int count){
		if(root == null)
			return;
		
		if(count == k)
			System.out.print(root.data+" ");
		nodesAtDistance(root.left, k, count+1);
		nodesAtDistance(root.right, k, count+1);
	}
	
	
	public static void main(String[] args) {
		TreeOperations.insert();
		nodesAtDistance(TreeOperations.root, 2, 0);
	}

}

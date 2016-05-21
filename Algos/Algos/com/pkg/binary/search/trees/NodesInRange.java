package com.pkg.binary.search.trees;

public class NodesInRange {

	
	private static void nodesInRange(TreeNode root, int start, int end){
		
		
		if(root == null)
			return;
				
		nodesInRange(root.left, start, end);
		if((root.data >= start && root.data <= end)){
			if(root != null &&root.data >= start && root.data <= end){
				System.out.println(root.data);
			}
		}
		nodesInRange(root.right, start, end);
	}
	
	public static void main(String[] args) {
		TreeOperations.insert();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		nodesInRange(TreeOperations.root, 5, 45);
	}

}

package com.pkg.binary.trees;


public class MinimumValueBST {
	
	static int[] input = {12, 16, 9, 10, 7, 3, 8, 14, 19, -1};
	
	public static void main(String[] args) {
		
		for (int i = 0; i < input.length; i++) {
			TreeOperations.insert();
		}
		
		System.out.println(findMinimumValue(TreeOperations.root));
	}
	
	public static int findMinimumValue(TreeNode current){
		if(current == null) return -1;
		while(current != null){
			if(current.left == null)
				return current.data;
			current = current.left;
		}
		
		return -1;
	}
}

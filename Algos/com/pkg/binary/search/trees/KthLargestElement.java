package com.pkg.binary.search.trees;

public class KthLargestElement {

	static int c = 0;
	private static void kLargestNode(TreeNode root, int k){
		
		if(root == null || c >= k)
			return;

		kLargestNode(root.right, k);
		c++;
		System.out.println("c: " + c +" root : " + root.data);
		if(c==k){
			System.out.println(root.data);
			return;
		}
		
		kLargestNode(root.left, k);
	}
	
	public static void main(String[] args) {
		TreeOperations.insert();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		kLargestNode(TreeOperations.root, 4);
	}

}

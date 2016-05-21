package com.pkg.binary.trees;

public class KeysInRangeBST {
	
	
	public static void printKeys(TreeNode current, int k1, int k2){
		
		if(current == null)
			return;
		if(current.data > k2)
			return;
		if(current.data > k1)
		printKeys(current.left, k1, k2);
		if(current.data > k1 && current.data < k2)
			System.out.print(current.data + " ");
		if(current.data < k2)
		printKeys(current.right, k1, k2);
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < TreeOperations.input.length; i++) {
			TreeOperations.insert();
		}
		printKeys(TreeOperations.root, 8, 22);
	}

}

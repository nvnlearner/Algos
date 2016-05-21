package com.pkg.binary.trees;

public class InOrderSuccessor {
	static TreeNode succ = TreeOperations.root;
	
	public static TreeNode findISucessor(TreeNode current, TreeNode key){

		if (key.right != null){
			return findISucessor(key.right);
		}
		
		while(current != null){
			if (current.data < key.data) {
				current = current.right;
			}
			else if(current.data > key.data){
				succ = current;
				current = current.left;
			}
			else
				break;
		}
		
		return succ;
	}

	private static TreeNode findISucessor(TreeNode current) {
		
		if(current.left == null)
			return current;
		
		return findISucessor(current.left);
	}

	public static void main(String[] args) {
		for (int i = 0; i < TreeOperations.input.length; i++) {
			TreeOperations.insert();
		}
		System.out.println(findISucessor(TreeOperations.root, TreeOperations.root.left.left.right).data);
	}

}

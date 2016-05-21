package com.pkg.binary.trees;

public class InOrderSuccessors {
	
	//Incomplete
	private static void inOrderSuccessor(TreeNode root){
		if(root == null)return;
		//TreeNode parent = root;
		inOrderSuccessor(root.left);
		inOrderSuccessor(root.right);
		if(root.left == null && root.right == null){
			System.out.println("root : " + root.data + " successor : " + -1);
			//return;
		}
		if(root.right != null){
			int val = findInorderSuccessor(root, root.right);
			System.out.println("root : " + root.data + " successor : " + val);
			//return;
		}
		
	}

	private static int findInorderSuccessor(TreeNode root, TreeNode node) {
		
		if(node == null)
			return -1;
		if(node.left == null && node.right == null)
			return node.data;
		return findInorderSuccessor(node, node.left);
	}

	public static void main(String[] args) {
			TreeOperations.root = new TreeNode(5);
			TreeOperations.root.left = new TreeNode(3);
			TreeOperations.root.right = new TreeNode(25);
			TreeOperations.root.right.left = new TreeNode(15);
			TreeOperations.printBinaryTree(TreeOperations.root, 0);
			inOrderSuccessor(TreeOperations.root);
	}

}

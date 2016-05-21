package com.pkg.binary.trees;

public class SubTrees {

	
	private static boolean isSubTree(TreeNode tree, TreeNode subTree){
	
		if(subTree == null)
			return true;
		if(tree == null)
			return false;
		
		if(tree.data == subTree.data && isSubTreeUtil(tree, subTree)){
			if(isSubTreeUtil(tree, subTree))
				return true;
		} else{
			return isSubTree(tree.left, subTree) || isSubTree(tree.right, subTree);
		}
		
		return false;
	}
	
	
	private static boolean isSubTreeUtil(TreeNode tree, TreeNode subTree) {
		if(subTree == null)
			return true;
		if(tree == null)
			return false;
		
		if(tree.data == subTree.data){
			return isSubTreeUtil(tree.left, subTree.left) && isSubTreeUtil(tree.right, subTree.right);
		}
		return false;
	}


	public static void main(String[] args) {
		TreeOperations.root = new TreeNode(10);
		TreeOperations.root.left = new TreeNode(4);
		TreeOperations.root.right = new TreeNode(6);
		TreeOperations.root.right.right = new TreeNode(6);
		//TreeOperations.root.right.left = new TreeNode(40);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		TreeOperations.root1 = new TreeNode(26);
		TreeOperations.root1.left = new TreeNode(10);
		TreeOperations.root1.right = new TreeNode(3);
		TreeOperations.root1.left.left = new TreeNode(4);
		TreeOperations.root1.left.right = new TreeNode(6);
		TreeOperations.root1.left.right.left = new TreeNode(6);
		TreeOperations.root1.right.right = new TreeNode(30);
		TreeOperations.printBinaryTree(TreeOperations.root1, 0);
		System.out.println(isSubTree(TreeOperations.root1, TreeOperations.root));
	}

}

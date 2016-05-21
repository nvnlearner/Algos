package com.pkg.binary.search.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

	private static void inOrder(TreeNode node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	private static void preOrder(TreeNode node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	private static void postOrder(TreeNode node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	private static void levelOrder(TreeNode root){
		for (int i = 1; i <= TreeOperations.height(root); i++) {
			System.out.println();
			level(root, i);
		}
	}
	
	private static void level(TreeNode root, int level){
		if(root == null)
			return;
		if(level == 1){
			System.out.print(root.data);
		}
		level(root.left, level-1);
		level(root.right, level-1);
	}
	
	
	
	private static void levelOrderNextLine(TreeNode root){
		if(root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int nodeCount = 0;
		while(true){
			nodeCount = queue.size();
			if(nodeCount == 0)
				break;
			System.out.println();
			while(nodeCount > 0){
				TreeNode node = queue.poll();
				System.out.print(node.data+" ");
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
				nodeCount--;
			}
		}
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.print("InOrder : ");
		inOrder(root);
		System.out.println();
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println();
		System.out.print("PostOrder : ");
		postOrder(root);
		levelOrder(root);
		TreeOperations.insert();
		TreeOperations.printBinaryTree(root, 0);
		levelOrderNextLine(root);
	}

}

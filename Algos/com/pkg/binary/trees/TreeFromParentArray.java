package com.pkg.binary.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeFromParentArray {
	
	private static int[] input = {-1, 0, 0, 1, 1, 3, 5};
	private static void constructTree(){
		
		int root = findRootElement();
		if(root == -1)
			return;
		addChildren(root);
	}

	private static void addChildren(int node) {
		TreeOperations.root = new TreeNode(node);
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode root = TreeOperations.root;
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			queue = findChildrenNodes(root.data, queue);
			TreeNode l = queue.poll();
			TreeNode r = queue.poll();
			root.right = r;
			root.left = l;
			if (l != null)
				queue.add(l);
			if (r != null)
				queue.add(r);
		}
	}

	private static Queue<TreeNode> findChildrenNodes(int data, Queue<TreeNode> queue) {
		for (int i = 0; i < input.length; i++) {
			if(input[i] == data){
				queue.add(new TreeNode(i));
			}
		}
		return queue;
	}

	private static int findRootElement() {
		for (int i = 0; i < input.length; i++) {
			if(input[i] == -1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		constructTree();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);

	}

}

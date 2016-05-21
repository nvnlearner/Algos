package com.pkg.binary.search.trees;

import java.util.*;

public class CommonNodesBinaryTree {

	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	private static void commonNodes(TreeNode root1, TreeNode root2){
		insert(root1);
		commonNodesUtil(root2);
		
	}
	
	
	private static void commonNodesUtil(TreeNode root) {
		if(root == null)
			return;
		if(map.containsKey(root.data)){
			System.out.println(root.data);
		}
		commonNodesUtil(root.left);
		commonNodesUtil(root.right);
	}


	private static void insert(TreeNode root1) {
		if(root1 == null)
			return;
		if(map.containsKey(root1.data)){
			int value = map.get(root1.data);
			map.put(root1.data, value++);
		} else{
			map.put(root1.data, 1);
		}
		insert(root1.left);
		insert(root1.right);
	}


	public static void main(String[] args) {
		TreeOperations.insert();
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println();
		commonNodes(TreeOperations.root, TreeOperations.root);
	}

}

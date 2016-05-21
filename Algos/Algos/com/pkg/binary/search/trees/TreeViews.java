package com.pkg.binary.search.trees;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class TreeViews {

	private static Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
	private static Queue<TreeNode> queue = new LinkedList<TreeNode>();
	
	private static void bottomView(TreeNode root){
		if(root == null)
			return;
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode temp = queue.remove();
			map.put(temp.h, temp.data);
			
			if(temp.left != null){
				temp.left.h = temp.h-1;
				queue.add(temp.left);
			}
			
			if(temp.right != null){
				temp.right.h = temp.h+1;
				queue.add(temp.right);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer, Integer>> itr = entrySet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next().getValue());
		}
	}
	
	static Set<Integer> set = new TreeSet<Integer>();
	private static void topView(TreeNode root){
		if(root == null)
			return;
		if(set.add(root.h))
			System.out.println(root.data);
		if(root.left != null){
			root.left.h = root.h-1;
			topView(root.left);
		}
		if(root.right != null){
			root.right.h = root.h+1;
			topView(root.right);
		}
	}
	static int maxLevel;
	private static void leftView(TreeNode root, int level){
		if(root == null)
			return;
		
		if(maxLevel < level){
			System.out.println(root.data);
			maxLevel = level;
		}
		leftView(root.left, level+1);
		leftView(root.right, level+1);
	}
	
	private static void rightView(TreeNode root, int level){
		
		if(root == null)
			return;
		
		if(maxLevel < level){
			System.out.println(root.data);
			maxLevel = level;
		}
		rightView(root.right, level+1);
		rightView(root.left, level+1);
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < TreeOperations.input.length; i++) {
			TreeOperations.insert(TreeOperations.input[i]);	
		}
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		//bottomView(TreeOperations.root);
		//topView(TreeOperations.root);
		//leftView(TreeOperations.root, 1);
		rightView(TreeOperations.root, 1);
	}

}

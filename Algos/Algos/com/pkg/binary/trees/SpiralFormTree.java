package com.pkg.binary.trees;

import java.util.Stack;

public class SpiralFormTree {

	private static void printSpiralForm(Stack<TreeNode> stack, int level){
			if(stack.isEmpty())
				return;
		Stack<TreeNode> newStack = new Stack<TreeNode>();
		while(!stack.isEmpty()){
			 TreeNode node = stack.pop();
			 System.out.print(node.data + " ");
			 if(level % 2 != 0){
				 if(node.left != null)
					 newStack.push(node.left);
				 if(node.right != null)
					 newStack.push(node.right);
			 }
			 else{
				 if(node.right != null)
					 newStack.push(node.right);
				 if(node.left != null)
					 newStack.push(node.left);
			 }

		}
		System.out.println();
		printSpiralForm(newStack, level+1);
	}
	
	
	public static void main(String[] args) {
		TreeOperations.insert();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(TreeOperations.root);
		printSpiralForm(stack, 0);
	}

}

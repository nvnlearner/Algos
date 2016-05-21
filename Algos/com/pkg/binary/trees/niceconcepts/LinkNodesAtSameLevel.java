package com.pkg.binary.trees.niceconcepts;

/*
 * http://www.geeksforgeeks.org/connect-nodes-at-same-level-with-o1-extra-space/
 */
public class LinkNodesAtSameLevel {
	
	private static void connectNodes(TreeNode root){
		if(root == null)
			return;
		
		if(root.left != null){
			if(root.right != null){
				root.left.next = root.right;
				root.right.next = getNext(root);
			} else
				root.left.next = getNext(root);
			
			connectNodes(root.left);
		}
		
		
		if(root.right != null){
			root.right.next = getNext(root);
			connectNodes(root.right);
		}
		else
			connectNodes(getNext(root));
	}

	private static TreeNode getNext(TreeNode root) {
		TreeNode temp = root.next;
		
		while(temp != null){
			if(temp.left != null)
				return temp.left;
			if(temp.right != null)
				return temp.right;
		}
		return null;
	}

	public static void main(String[] args) {

	}

}

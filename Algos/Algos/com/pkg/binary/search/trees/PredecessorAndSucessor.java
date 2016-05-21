package com.pkg.binary.search.trees;

public class PredecessorAndSucessor {

	
	private static void inOrderPredecessorSuccessor(TreeNode root, int k, TreeNode pre, TreeNode succ){
		if(root == null)
			return;
		
		if(root.data == k){
			TreeNode temp = root;
			if(root.left != null){
				while(temp.right != null){
					temp = temp.right;
					
				}
				pre = temp;
				
			}
			if(pre != null)
				System.out.println("Pre : "+pre.data);
			else
				System.out.println("Pre : " + -1 );
			if(root.right != null){
				temp = root;
				while(temp.left != null){
					temp = temp.left;
					
				}
				succ = temp;
				
			}
			if(succ != null)
				System.out.println("Suc : "+ succ.data);
			else
				System.out.println("Suc : " + -1 );
			return;
		}
		
		if(root.data < k){
			pre = root;
			inOrderPredecessorSuccessor(root.right, k, pre, succ);
		} else{
			succ = root;
			inOrderPredecessorSuccessor(root.left, k, pre, succ);
		}
	}
	public static void main(String[] args) {
		TreeOperations.insert();
		inOrderPredecessorSuccessor(TreeOperations.root, 0, null, null);
	}

}

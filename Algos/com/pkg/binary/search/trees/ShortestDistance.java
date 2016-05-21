package com.pkg.binary.search.trees;

public class ShortestDistance {

	static int lLevel = Integer.MAX_VALUE; static int rLevel = Integer.MAX_VALUE;
	
	private static TreeNode commonAncesstor(TreeNode root, TreeNode one, TreeNode two){
		
			if(root != null && root.data < one.data && root.data < two.data){
				return commonAncesstor(root.right, one, two);
			}
			if(root != null && root.data > one.data && root.data > two.data){
				return commonAncesstor(root.left, one, two);
			}
			if(root != null && ((root.data > one.data && root.data < two.data) || (root.data > one.data && root.data < two.data))){
				return root;
			}
		
		return root;
	}
	
	private  static void findShortestDistance(TreeNode root, TreeNode one, TreeNode two, int level){
		if(root == null){
			return;
		}
		
		if(one != null && two != null && one.data == two.data)
			System.out.println(0);
		
		if(root.data == one.data || root.data == two.data){
			if(lLevel == Integer.MAX_VALUE)
				lLevel = level;
			else{
				rLevel = level;
			}
			
		}
		 findShortestDistance(root.left, one, two, level+1);
		 findShortestDistance(root.right, one, two, level+1);
	}
	
	private static int shortDistance(TreeNode root, TreeNode one, TreeNode two) {
		TreeNode commonRoot = commonAncesstor(root, one, two);
		System.out.println(root.data);
		 findShortestDistance(commonRoot, one, two, 0);
		 return lLevel+rLevel;
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(5);
		for (int i = 0; i < TreeOperations.input.length; i++)
		TreeOperations.insert(TreeOperations.input[i]);
		TreeOperations.printBinaryTree(TreeOperations.root, 0);
		System.out.println(shortDistance(TreeOperations.root, node1, node2));
	}

}

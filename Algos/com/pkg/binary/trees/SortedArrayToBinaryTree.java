package com.pkg.binary.trees;

public class SortedArrayToBinaryTree {

	static int[] arr = {1, 2, 3, 4};
	public static void convertSortedArrayToBST(int[] arr, int start, int end){
		
		if(start > end) return;
		
		int mid = (start + end)/2;
		
		TreeOperations.insert();
		convertSortedArrayToBST(arr, start, mid-1);
		convertSortedArrayToBST(arr, mid+1, end);
	}
	
	public static void main(String[] args) {
		convertSortedArrayToBST(arr, 0, arr.length-1);
		TreeOperations.preOrder(TreeOperations.root);
	}

}

package com.pkg.sorts;

public class MergeSort {
	
	private static int[] input = {0, 10, 1, -1, 10, 9, 8, 2, 5};
	
	private static void mergeSort(int low , int high){
		if(low < high){
			
			int mid = low+(high-low)/2;
			
			mergeSort(low, mid);
			mergeSort(mid+1, high);
			merge(low, mid, high);
		}
		
	}

	private static void merge(int low, int mid, int high) {
		int[] helperArray = new int[input.length];
		for (int k = 0; k < helperArray.length; k++) {
			helperArray[k] = input[k];
		}
		int i = low; int k = mid+1; int j = low;
		
		while(i <= mid && k <= high){
			if(helperArray[i] <= helperArray[k]){
				input[j++] = helperArray[i];
				i++;
			} else{
				input[j++] = helperArray[k];
				k++;
			}
		}
		
		while(j <= mid)
			input[j++] = input[i++];
		
	}

	public static void main(String[] args) {
		mergeSort(0, input.length-1);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}

package com.pkg.sorts;

public class QuickSort {

	private static int[] input = {0, 10, 1, -1, 10, 9, 8, 2, 5};
	private static void quickSort(int low, int high){
		int i = low; int j = high;
		if(i <= j){
			int mid = low+(high-low)/2;
			
			while(input[i] < input[mid])
				i++;
			
			while(input[j] > input[mid])
				j--;
			
			if(i <= j){
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
			
			if(i <= high)
				quickSort(i, high);
			if(low <= j)
				quickSort(low, j);
		}
	}
	
	
	public static void main(String[] args) {
		quickSort(0, input.length-1);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}

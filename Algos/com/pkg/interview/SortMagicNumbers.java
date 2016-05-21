package com.pkg.interview;

public class SortMagicNumbers {

	private static int[] input = {1,3,2,1,2,2,3,3,1,1,2,3, 4, 4 ,1,2,3,4};
	
	static int t3;
	private static void arrangeInput(){
		int t2 = input.length-1;
		for (int i = 1; i < 4; i++) {
			checkUtil(t3, t2, i);
		}
	}
	
	private static void checkUtil(int t1, int t2, int k){
		int i =t1;
		for (  ; i < input.length; i++) {
			if(input[i] != k){
				t2 = check(i, t2, k);
				if(t2 == -1)
					break;
			}
		}
		
		t3 = i;
	}
	private static int check(int t1, int t2, int k){
		while(true){
			if(t2 <= t1)
				break;
			if(input[t2] == k){
				int temp = input[t1];
				input[t1] = input[t2];
				input[t2] = temp;
				return t2;
			}else
			t2--;
		}
		return -1;
	}
	public static void main(String[] args) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		arrangeInput();
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}

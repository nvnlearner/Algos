package com.pkg.other;

public class Permutations {
	static int[] input = { 1, 4, 5 };

	private static void permutate(int[] a, int k, int n) {
		int temp;
		if (k == n)
			print(a);
		else {
			for (int i = k; i <= n; i++) {
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				permutate(a, k+1, n);
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;// backtrack
			}
		}
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		permutate(input, 0, input.length - 1);
	}

}

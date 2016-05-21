package com.pkg.competitive.coding;

//Print all prime numbers less than 1000000

public class SieveofEratosthenes {

	private static boolean[] isPrime;
	
	private static void findPrimes(int number){
		
		isPrime = new boolean[number];
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i< number; i++){
			if(isPrime[i]){
				for (int j = i*2; j < number; j+=i) {
					isPrime[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		findPrimes(10000);
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				System.out.print(i+" ");
			}
		}
	}

}

package com.pkg.primes;

public class SeivesMethod {
	
	private static boolean[] isPrime;
	private static int[] allPrime;
	private static boolean[] isPrimeNow;
	private static void seivesPrimeMethod(int n){
		//int range = (int) Math.sqrt(n);
		isPrime = new boolean[n+1];
		allPrime = new int[n+1];
		for (int i = 0; i < isPrime.length; i++)
			isPrime[i] = true;
		
		for (int i = 2; i*i <= n; i++) {
			if(isPrime[i]){
				for (int j = 2*i; j <= n; j=i+j)
					isPrime[j] = false;
			}
		}
		
		int count =0;
		for (int i = 2; i < isPrime.length; i++) {
			if(isPrime[i])
			allPrime[count++] = i;
		}
	}

	private static void segmentedSieveMethod(int n1, int n2){
		seivesPrimeMethod(n2);
		isPrimeNow = new boolean[(n2-n1)+1];
		for (int i = 0; i < isPrimeNow.length; i++) {
			isPrimeNow[i]= true;
		}
		for (int i = 0; i < allPrime.length; i++) {
			if(allPrime[i] == 0 || allPrime[i] > Math.sqrt(n2))break;
			int val = n1/allPrime[i];
			val*=allPrime[i];
			
			for (int j = val; j <= n2; j+=allPrime[i]) {
				if(j<n1) continue;
				isPrimeNow[j-n1]=false;
			}
		}
		
		for (int i = 0; i < isPrimeNow.length; i++) {
			if(isPrimeNow[i]){
				System.out.print(i+n1 + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		//seivesPrimeMethod(25);
		segmentedSieveMethod(100, 111);
	}

}

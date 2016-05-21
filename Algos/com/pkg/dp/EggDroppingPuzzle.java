package com.pkg.dp;

public class EggDroppingPuzzle {
	
	private static int eggDrop(int eggs, int floors){
		if(floors == 1 || floors == 0)
			return floors;
		
		if(eggs == 1)
			return floors;
		int res; int min = Integer.MAX_VALUE;
		for (int i = 1; i <= floors; i++) {
			res =  Math.max(eggDrop(eggs-1, i-1), eggDrop(eggs, floors-i));
			if(res < min)
				min = res;
		}
		return min+1;
	}
	
	public static void main(String[] args) {
			System.out.println(eggDrop(2, 10));
	}

}

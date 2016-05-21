package com.pkg.other;

public class ShortPalindrome {
	
	
	public static int findShortestPalindrome(String str){
		
		if(str == null || str.length() <= 0)
			return 0;
		String res=str;
		int i = 0; int j = str.length()-1;
		String res1 = "";
		String res2 = "";
		int count=0;
		while(i<j){
			
			if(Math.abs(i-j) == 1 && res.charAt(i) == res.charAt(j)){
				res1 = res.substring(0, i+1);
				 res2 = res.substring(j+1, res.length());
				 res=res1+res.charAt(i)+res2;
				 break;
			}
			if(res.charAt(i) != res.charAt(j)){
				 res1 = res.substring(0, i+1);
				 res2 = res.substring(j, res.length());
				 String temp = res.substring(i+1, j);
				res2+=res.charAt(i);
				res= res1+temp+res2;
			}
			++count;
			j = res.length()-(count+1);
			i++;
			System.out.println(res);
		}
		
		return res.length();
	}

	public static void main(String[] args) {
		System.out.println(findShortestPalindrome("tab"));
	}

}

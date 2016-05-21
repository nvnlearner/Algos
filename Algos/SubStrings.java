
public class SubStrings {
	
	
	private static void subStrings(String str){
		if(str == null) return;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= str.length()-i; j++) {
				System.out.println(str.substring(j, j+i));
			}
		}
	}
	public static void main(String[] args) {
		subStrings("naveen");
	}

}

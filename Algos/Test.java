import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
 
		int m, n;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < testCases; i++) {
 
			String[] s = br.readLine().split(" ");
			m = Integer.parseInt(s[0]);
			n = Integer.parseInt(s[1]);
 
			for (; m <= n; m++) {
				if (isPrime(m)) {
					sb.append(m + "\n");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
 
	}
 
	private static boolean isPrime(int j) {
		if (j == 2) {
			return true;
		}
		if (j == 1 || j % 2 == 0) {
			return false;
		}
 
		for (int i = 3; i * i <= j; i++) {
			if (j % i == 0) {
				return false;
			}
		}
		return true;
	}
 
}


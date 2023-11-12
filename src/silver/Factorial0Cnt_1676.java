package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial0Cnt_1676 {
	public static BigInteger factorial(int n) {
		if(n <= 1) return BigInteger.ONE;
		
		return new BigInteger(String.valueOf(n)).multiply(factorial(n - 1));
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
 		String result = String.valueOf(factorial(n));
		
		int cnt = 0;
		for (int i = result.length()- 1; i >= 0; i--) {
			if(result.charAt(i) != '0') {
				break;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

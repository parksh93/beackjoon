package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Fibonacci3 {
	static BigInteger[] ar = new BigInteger[10001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		ar[0] = BigInteger.ZERO;
		ar[1] = BigInteger.ONE;

		for (int j = 2; j < ar.length; j++) {
			ar[j] = ar[j - 2].add(ar[j - 1]);
		}
		
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int fiboCntNum = Integer.parseInt(st.nextToken());
			BigInteger modNum = new BigInteger(st.nextToken());
			
			System.out.println("Case #"+ (i + 1) + ": "+ ar[fiboCntNum].remainder(modNum));
		}
	}
}

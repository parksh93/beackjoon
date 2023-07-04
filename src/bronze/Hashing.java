package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Hashing {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String text = br.readLine();
		String al = "abcdefghijklmnopqrstuvwxyz";
		
		BigInteger bi = BigInteger.ZERO;
		int p = 0;
		for (int i = 0; i < L; i++) {
			int a = al.indexOf(text.charAt(i)) + 1;
			BigInteger bi2 = new BigInteger(String.valueOf(a));
			
			for (int j = 0; j < i; j++) {
				bi2 = bi2.multiply(new BigInteger("31"));
			}
			
			bi = bi.add(bi2);
			bi = bi.remainder(new BigInteger("1234567891"));
			p++;
		}
		
		System.out.println(bi);
	}
}

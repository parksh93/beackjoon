package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BinomialCoefficient1_11050 {
	public static int fact(int k) {
		if (k <= 1) {
			return 1;
		}
		
		return k * fact(k - 1);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int result = fact(n) / (fact(m) * fact(n - m)); 
		
		bw.write(String.valueOf(result));
		bw.flush();
	}
}

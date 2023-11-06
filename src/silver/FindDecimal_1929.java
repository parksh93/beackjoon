package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FindDecimal_1929 {
	public static boolean prime(int k) {
		if(k == 1) return false;
		for (int i = 2; i <= Math.sqrt(k); i++) {
			if(k % i == 0) return false;
		}
		
		return true;
	
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		StringBuffer sb = new StringBuffer(); 
		for (int i = m; i <= n; i++) {
			if(prime(i)) {
				sb.append(i).append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

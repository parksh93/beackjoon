package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fibonacci {
	static int [] cnt0 = new int[41];
	static int [] cnt1 = new int[41];
	static int [] ar = new int[41];
	
	static int fibonacci(int n) {
		if (n == 0) {
			cnt0[0]=1;
			return 0;
		}
		if (n == 1) {
			cnt1[1]=1;
			return 1;
		}
		if(ar[n] != 0) {
			cnt0[n] = cnt0[n-2] + cnt0[n-1];
			cnt1[n] = cnt1[n-2] + cnt1[n-1];
			return ar[n];
		}
		ar[n] =  fibonacci(n-2) + fibonacci(n-1);
		
		return ar[n];
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int numCnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numCnt; i++) {
			int n = Integer.parseInt(br.readLine());
			fibonacci(n);
			
			if(n != 1 && n != 0) {
				if(n == 2){
					cnt0[n] = cnt0[n-1] + cnt0[n-2];
					cnt1[n] = cnt1[n-1] + cnt1[n-2];
				}else {
					cnt0[n-1] = cnt0[n-2] + cnt0[n-3];
					cnt1[n-1] = cnt1[n-2] + cnt1[n-3];
					cnt0[n] = cnt0[n-1] + cnt0[n-2];
					cnt1[n] = cnt1[n-1] + cnt1[n-2];
				}
			}
	
			sb.append(cnt0[n]).append(" ").append(cnt1[n]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}

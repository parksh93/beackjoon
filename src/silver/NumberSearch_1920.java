package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberSearch_1920 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int [] nNums = new int [n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nNums.length; i++) {
			nNums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nNums);
		
		int m = Integer.parseInt(br.readLine());
		
		int [] result = new int [m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int mNum = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < n; j++) {
				if (mNum < nNums[j]) {
					break;
				}
				
				if (mNum == nNums[j]) {
					result[i] = 1;
					break;
				}
			}
		}
		
	
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}

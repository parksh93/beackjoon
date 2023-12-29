package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GrabberPig_3060 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int [] pigs = new int [6];
			
			int total = 0;
			for (int j = 0; j < pigs.length; j++) {
				int k = Integer.parseInt(st.nextToken( ));
				total += k;
			}
			
			int day = 1;
			
			while(total <= n) {
				total *= 4;
				day++;
			}
			
			sb.append(day).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] ar = new int [n];
		for (int i = 0; i < n; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		int s = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < ar.length; j++) {
			sb.append(ar[j]).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}

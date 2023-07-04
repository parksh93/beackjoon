package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class NandM3 {
	static int [] ar;
	static int n,m;
	static StringBuffer sb = new StringBuffer();
	static void dfs(int v) {	
		if (v == m) {
			for (int i : ar) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
				ar[v] = i+1;
				dfs(v+1);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		ar = new int [m];
		
		dfs(0);
		
		System.out.println(sb);
	}
}

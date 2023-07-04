package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NAndM_2 {
	static int [] ar;
	static boolean[] visited;
	static int n, m;
	static StringBuffer sb = new StringBuffer();
	static void dfs(int v,int idx) {
		if (v == m) {
			for (int i : ar) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = idx; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				ar[v] = i+1;
				dfs(v+1, i+1);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		ar = new int [m];
		visited = new boolean [n];
		
		dfs(0,0);
		
		System.out.println(sb);
	}
}

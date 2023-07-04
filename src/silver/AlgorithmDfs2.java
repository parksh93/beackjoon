package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AlgorithmDfs2 {
	static int n,m;
	static List<Integer> [] ar;
	static boolean [] visited;
	static int [] cnt;
	static int c;
	static void dfs(int v) {
		visited[v] = true;
		for (int i : ar[v]) {
			if (!visited[i]) {
				cnt[i] = cnt[v]+1;
				dfs(i);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
	
		ar = new ArrayList [n+1];
		visited = new boolean [n+1];
		visited[0] = true;
		cnt = new int [n+1];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ar[a].add(b);
			ar[b].add(a);
		}
		
		for (int i = 0; i < ar.length; i++) {
			Collections.sort(ar[i],Collections.reverseOrder());
		}
		
		dfs(r);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < cnt.length; i++) {
			if (!visited[i]) {
				cnt[i]= -1;
			}
			sb.append(cnt[i]).append("\n");
		}
		System.out.println(sb);
		
		
	}
}

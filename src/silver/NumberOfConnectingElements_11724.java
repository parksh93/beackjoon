package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NumberOfConnectingElements_11724 {
	static List<Integer>[] ar;
	static boolean[] visited;
	static int cnt;
	static int n;
	static void dfs(int v) {
		if (visited[v]) {
			return;
		}
		visited[v] = true;
		for (int i : ar[v]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		ar = new ArrayList [n+1];

		for (int i = 1; i <= n; i++) {
			ar[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			ar[a].add(b);
			ar[b].add(a);
		}
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}

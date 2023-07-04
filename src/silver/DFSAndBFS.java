package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSAndBFS {
	static int  [][] ar;
	static boolean [] visitedDFS;
	static boolean [] visitedBFS;
	static int N;
	static StringBuffer sb = new StringBuffer();
	static void dfs(int v) {
		visitedDFS[v] = true;
		sb.append(v).append(" ");
		
		for (int i : ar[v]) {
			if (!visitedDFS[i]) {
				dfs(i);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		ar = new int[N+1][N];
		visitedDFS = new boolean[N+1];
		visitedDFS[0] = true;
		
//		int [][] ar = {
//				{},
//				{2,3,4},
//				{1,4},
//				{1,4},
//				{1,2,3}
//		};
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < ar[a].length; j++) {
				if (ar[a][j] == 0) {
					ar[a][j] = b;
					break;
				}
			}
			for (int j = 0; j < ar[b].length; j++) {
				if (ar[b][j] == 0) {
					ar[b][j] = a;
					break;
				}
			}
			Arrays.sort(ar[a]);
			Arrays.sort(ar[b]);
		}
		
		dfs(V);
		sb.append("\n");
		
		visitedBFS = new boolean[N+1];
		visitedBFS[0] = true;
		
		//BFS
		que.offer(V);
		while(!que.isEmpty()) {
			int v = que.poll();
			
			if (!visitedBFS[v]) {
				visitedBFS[v] = true;
				sb.append(v).append(" ");
				for (int j : ar[v]) {
					que.offer(j);
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}

package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class AlgorithmStudy_BFS2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		List<Integer> [] ar = new ArrayList [n+1];
		boolean [] visited = new boolean [n+1]; 
		
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
		
		for (int i = 1; i < ar.length; i++) {
			Collections.sort(ar[i],Collections.reverseOrder());			
		}
		
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(r);
		visited[r] = true;
		
		int [] cntList = new int [n+1];
		int cnt = 0;
		while(!que.isEmpty()) {
			int v = que.poll();
			cnt++;
			cntList[v] += cnt;
			for (int j : ar[v]) {
				if (!visited[j]) {
					visited[j] = true;
					que.offer(j);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < cntList.length; i++) {
			sb.append(cntList[i]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}

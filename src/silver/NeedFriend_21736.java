package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NeedFriend_21736 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char [][] field = new char [n][m];
		boolean [][] visited = new boolean [n][m];
		
		Queue<int[]> que = new LinkedList<>();
		int [] x = {1, -1, 0, 0};
		int [] y = {0, 0, 1, -1};
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if(str.charAt(j) == 'I') {
					que.add(new int[]{i, j});
				}
				
				field[i][j] = str.charAt(j);
			}
		}
		
		int cnt = 0;
		while (!que.isEmpty()) {
			int [] ar = que.poll();
			int ax = ar[0];
			int ay = ar[1];
			
			for (int i = 0; i < 4; i++) {
				int nx = ax + x[i];
				int ny = ay + y[i];
				
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
					if(field[nx][ny] != 'X') {
						que.add(new int [] {nx, ny});
						visited[nx][ny] = true;
						if (field[nx][ny] == 'P') {
							cnt++;
						}
					}
				}
			}
		}
		
		if(cnt == 0) {
			System.out.println("TT");
		}else {
			System.out.println(cnt);
		}
	}
}

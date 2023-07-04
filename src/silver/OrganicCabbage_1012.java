package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class OrganicCabbage_1012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int [][] filed = new int [n][m];
			boolean [][] visited = new boolean [n][m];
			int [] dirX = {0, 0, -1, 1};
			int [] dirY = {1, -1, 0, 0};
			
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				filed[x][y] = 1;
			}
			
			Queue<int[]> que = new LinkedList<>();
			
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < m; l++) {
					if (!visited[j][l] && filed[j][l] == 1) {
						que.offer(new int [] {j, l});
						visited[j][l] = true;
						
						while (!que.isEmpty()) {
							int [] ar = que.poll();
							int x = ar[0];
							int y = ar[1];
							
							for (int o = 0; o < 4; o++) {
								int nX = dirX[o] + x;
								int nY = dirY[o] + y;
								
								if(nX >= 0 && nY >= 0 && nX < n && nY < m) {
									if (!visited[nX][nY] && filed[nX][nY] == 1) {
										que.offer(new int [] {nX, nY});
										visited[nX][nY] = true;
									}
								}
							}
						}
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}

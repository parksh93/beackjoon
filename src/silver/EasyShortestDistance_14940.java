package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EasyShortestDistance_14940 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		int [][] field = new int [n][m];
		
		int [] dirX = {1, -1, 0, 0};
		int [] dirY = {0, 0, 1, -1};
		
		Queue<int[]> que = new LinkedList<>();
		boolean [][] visited = new boolean [n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int in = Integer.parseInt(st.nextToken());
				field[i][j] = in;
				if (in == 2) {
					que.add(new int [] {i, j});
					visited[i][j] = true;
				}
			}
		}
		
		int [][] result = new int [n][m];
				
		while (!que.isEmpty()) {
			int [] ar = que.poll();
			
			int x = ar[0];
			int y = ar[1];
			
			for (int k = 0; k < 4; k++) {
				int nx = x + dirX[k];
				int ny = y + dirY[k];
				
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
					if (field[nx][ny] != 0) {
						que.add(new int[] {nx, ny});
						result[nx][ny] = result[x][y] + 1;
						visited[nx][ny] = true;
					}
				}
			}
		}
				
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				if (!visited[i][j] && field[i][j] == 1) {
					sb.append(-1).append(" ");
				}else {
					sb.append(result[i][j]).append(" ");
				}
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

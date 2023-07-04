package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TreasureIsland {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] island = new char[n][m];
		int dirX[] = { 0, 0, -1, 1 };
		int dirY[] = { 1, -1, -0, 0 };

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				island[i][j] = str.charAt(j);
			}
		}

		Queue<int[]> que = new LinkedList<>();
		
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int [][] arr = new int[n][m];
				boolean[][] visited = new boolean[n][m];
				
				if (island[i][j] == 'L') {
					que.offer(new int[] { i, j });
					visited[i][j] = true;

					while (!que.isEmpty()) {
						int[] ar = que.poll();
						int x = ar[0];
						int y = ar[1];

						for (int k = 0; k < 4; k++) {
							int nX = dirX[k] + x;
							int nY = dirY[k] + y;

							if (nX >= 0 && nY >= 0 && nX < n && nY < m) {
								if (!visited[nX][nY] && island[nX][nY] == 'L') {
									visited[nX][nY] = true;
									que.offer(new int[] { nX, nY });
									arr[nX][nY] = arr[x][y] + 1;
									
									result = Math.max(result, arr[nX][nY]);
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(result);
	}
}

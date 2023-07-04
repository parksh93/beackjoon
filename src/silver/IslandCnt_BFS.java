package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class IslandCnt_BFS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<int[]> que = new LinkedList<>();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0) {
				break;
			}

			int island[][] = new int[h][w];
			boolean visited[][] = new boolean[h][w];
			int[] dirX = { 0, 0, -1, 1, -1, 1, -1, 1 };
			int[] dirY = { 1, -1, 0, 0, 1, 1, -1, -1 };

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					island[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int cnt = 0;
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visited[i][j] && island[i][j] == 1) {
						que.offer(new int[] { i, j });
						visited[i][j] =true;
						
						while (!que.isEmpty()) {
							int[] arr = que.poll();

							int x = arr[0];
							int y = arr[1];

							for (int k = 0; k < 8; k++) {
								int nowX = dirX[k] + x;
								int nowY = dirY[k] + y;

								if (nowX >= 0 && nowY >= 0 && nowX < h && nowY < w) {
									if (!visited[nowX][nowY] && island[nowX][nowY] == 1) {
										visited[nowX][nowY] = true;
										que.offer(new int[] { nowX, nowY });
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

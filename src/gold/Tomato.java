package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[][] box = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		int[] dirX = { 0, 0, -1, 1 };
		int[] dirY = { -1, 1, 0, 0 };

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Queue<int[]> que = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && box[i][j] == 1) {
					que.offer(new int[] { i, j });
					visited[i][j] = true;
				}
			}
		}

		while (!que.isEmpty()) {
			int[] ar = que.poll();
			int x = ar[0];
			int y = ar[1];
			
			for (int k = 0; k < 4; k++) {
				int nowX = dirX[k] + x;
				int nowY = dirY[k] + y;

				if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m) {
					if (!visited[nowX][nowY] && box[nowX][nowY] == 0) {
						visited[nowX][nowY] = true;
						box[nowX][nowY] = box[x][y] + 1;
						que.offer(new int[] { nowX, nowY });
					}
				}
			}
		}

		int maxNum = 0;
		outer : for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && box[i][j] == 0) {
					maxNum = -1;
					break outer;
				}else {
					if (maxNum  < box[i][j]) {
						maxNum = box[i][j]-1;
					}
				}
			}
		}
		
		System.out.println(maxNum);
	}
}

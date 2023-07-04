package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] maze = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		int[] dirX = { 0, 0, -1, 1 };
		int[] dirY = { 1, -1, 0, 0 };

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = Character.getNumericValue(s.charAt(j));
			}
		}
		Queue<int[]> que = new LinkedList<>();

		que.offer(new int[] { 0, 0 });
		visited[0][0] = true;

		while (!que.isEmpty()) {
			int[] ar = que.poll();
			int x = ar[0];
			int y = ar[1];

			for (int k = 0; k < 4; k++) {
				int nX = dirX[k] + x;
				int nY = dirY[k] + y;

				if (nX >= 0 && nY >= 0 && nX < n && nY < m) {
					if (!visited[nX][nY] && maze[nX][nY] == 1) {
						que.offer(new int[] { nX, nY });
						visited[nX][nY] = true;
						maze[nX][nY] = maze[x][y] + 1;
					}
				}
			}
		}

		System.out.println(maze[n-1][m-1]);
	}
}

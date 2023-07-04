package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ward {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		char fild[][] = new char[r][c];
		boolean visited[][] = new boolean[r][c];
		char[][] result = new char[r][c];
		int[] dirX = { 0, 0, -1, 1 };
		int[] dirY = { 1, -1, 0, 0 };

		for (int i = 0; i < r; i++) {
			String s = br.readLine();
			for (int j = 0; j < c; j++) {
				fild[i][j] = s.charAt(j);
			}
		}

		st = new StringTokenizer(br.readLine());
		int hR = Integer.parseInt(st.nextToken()) - 1;
		int hC = Integer.parseInt(st.nextToken()) - 1;

		String history = br.readLine();

		Queue<int[]> que = new LinkedList<>();

		for (int i = 0; i < history.length(); i++) {
			if (history.charAt(i) == 'L') {
				if (hC - 1 >= 0) {
					hC -= 1;
				}
			} else if (history.charAt(i) == 'R') {
				if (hC + 1 < c) {
					hC += 1;
				}
			} else if (history.charAt(i) == 'U') {
				if (hR - 1 >= 0) {
					hR -= 1;
				}
			} else if (history.charAt(i) == 'D') {
				if (hR + 1 < r) {
					hR += 1;
				}
			} else if (history.charAt(i) == 'W') {
				que.offer(new int[] { hR, hC });
				visited[hR][hC] = true;
				result[hR][hC] = '.';

				while (!que.isEmpty()) {
					int[] ar = que.poll();
					int x = ar[0];
					int y = ar[1];

					char c1 = fild[x][y];
					for (int j = 0; j < 4; j++) {
						int nowX = dirX[j] + x;
						int nowY = dirY[j] + y;

						if (nowX >= 0 && nowY >= 0 && nowX < r && nowY < c) {
							if (!visited[nowX][nowY] && fild[nowX][nowY] == c1) {
								que.offer(new int[] { nowX, nowY });
								visited[nowX][nowY] = true;
								result[nowX][nowY] = '.';
							}
						}
					}
				}
			}
			
		}
		result[hR][hC] = '.';
		
		for (int j = 0; j < 4; j++) {
			int nowX = dirX[j] + hR;
			int nowY = dirY[j] + hC;
			
			if (nowX >= 0 && nowY >= 0 && nowX < r && nowY < c) {
				result[nowX][nowY] = '.';
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (result[i][j] == 0) {
					result[i][j] = '#';
				}
				sb.append(result[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

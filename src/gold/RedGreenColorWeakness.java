package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedGreenColorWeakness {
	static char [][] box;
	static boolean [][] visited;
	static int n, cnt1, cnt2;
	static int [] dirX = {0, 0, -1, 1};
	static int [] dirY = {-1, 1, 0, 0};
	static void dfs1(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nowX = dirX[i] + x;
			int nowY = dirY[i] + y;
			
			char c = box[x][y];
			
			if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n) {
				if (!visited[nowX][nowY]&& box[nowX][nowY] == c) {
					visited[nowX][nowY] = true;
					dfs1(nowX, nowY);
				}
			}
		}
	}
	
	static void dfs2(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nowX = dirX[i] + x;
			int nowY = dirY[i] + y;
			
			char c = box[x][y];
			
			if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n) {
				if (box[nowX][nowY] == 'G') {
					box[nowX][nowY] = 'R';
				}
				if (!visited[nowX][nowY]&& box[nowX][nowY] == c) {
					visited[nowX][nowY] = true;
					dfs2(nowX, nowY);
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		box = new char [n][n];
		visited = new boolean [n][n];
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				box[i][j] = line.charAt(j);
			}
		}
		
		cnt1 = 0;
		cnt2 = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					dfs1(i, j);
					cnt1++;
				}
			}
		}
		
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					visited[i][j] = true;
					if (box[i][j] == 'G') {
						box[i][j] = 'R';
					}
					dfs2(i, j);
					cnt2++;
				}
			}
		}
		
		System.out.println(cnt1 + " " + cnt2);
	}
}

package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class War_Battle {
	static  char [][] filed;
	static boolean [][] visited;
	static int [] dirX = {0, 0, -1, 1};
	static int [] dirY = {-1, 1, 0, 0};
	static int n,m;
	static int bfs(int x, int y) {
		Queue<int []> que = new LinkedList<>();
		int cnt = 0;
		
		que.offer(new int[] {x, y});
		
		char c = filed[x][y];
		while (!que.isEmpty()) {
			int [] a = que.poll();
			x = a[0];
			y = a[1];
			
			for (int i = 0; i < 4; i++) {
				int nowX = dirX[i] + x;
				int nowY = dirY[i] + y;
				
				if (nowX >= 0 && nowY >= 0 && nowX < m && nowY < n) {
					if (!visited[nowX][nowY] && filed[nowX][nowY] == c) {
						que.offer(new int[] {nowX, nowY});
						visited[nowX][nowY] = true;
						cnt++;
					}
				}
			}
		}
		
		if (cnt == 0) {
			cnt = 1;
		}
		
		return (cnt * cnt);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		filed = new char [m][n];
		visited = new boolean [m][n];
 		
		for (int i = 0; i < m; i++) {
			String l = br.readLine();
			for (int j = 0; j < n; j++) {
				filed[i][j] = l.charAt(j);
			}
		}
		
		
		int wCnt = 0;
		int bCnt = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					int cnt = bfs(i, j);
					if (filed[i][j] == 'W') {
						wCnt += cnt;
					}else {
						bCnt += cnt;
					}
				}
				
			}
		}
		
		System.out.println(wCnt + " " + bCnt);
	}
}

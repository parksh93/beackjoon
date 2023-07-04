package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JumpKingJJerryLarge {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int [][] fild = new int [n][n];
		boolean [][]visited = new boolean [n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				fild[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Queue<int []> que = new LinkedList<>();
		que.offer(new int[] {0,0});
		
		int result = 0;
		int nX = 0;
		int nY = 0;
		while(!que.isEmpty()) {
			int [] ar = que.poll();
			int x = ar[0];
			int y = ar[1];
			
			int c = fild[x][y];
			if (c == -1) {
				result = c;
				break;
			}
			
			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					nX = c + x;
					nY = y;
				}else {
					nX = x;
					nY = c + y;
				}
				
				if (nX >= 0 && nY >= 0 & nX < n && nY < n) {
					if (!visited[nX][nY]) {
						que.offer(new int [] {nX, nY});
						visited[nX][nY] = true;
					}
				}
			}
		}
		if (result == -1) {
			System.out.println("HaruHaru");
		}else{
			System.out.println("Hing");
		}
	}
}

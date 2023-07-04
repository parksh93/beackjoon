package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IslandCnt_DFS {
	static int [][] ar;
	static boolean [][] visited;
	static int w, h;
	static void dfs(int v) {
		if (v == 0) return;
		if (v > h) return;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if (w == 0 && h == 0) {
				break;
			}
			ar = new int [h][w];
			visited = new boolean [h][w];
			
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					ar[i][j] =  Integer.parseInt(st.nextToken());
				}
			}
			
		}
	}
}

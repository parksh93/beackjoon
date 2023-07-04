package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ComplexNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int [][] arr = new int [n][n];
		boolean [][] visited = new boolean[n][n];
		int dirX[] = {0, 0, -1, 1};
		int dirY[] = {1, -1, 0, 0};
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = Character.getNumericValue(s.charAt(j));
			}
		}
		
		Queue<int []> que = new LinkedList<>();
		List<Integer> cntList = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cnt = 1;
				if (!visited[i][j] && arr[i][j] == 1) {
					que.offer(new int[] {i, j});
					visited[i][j] = true;
					while(!que.isEmpty()) {
						int [] ar = que.poll();
						int x = ar[0];
						int y = ar[1];
						
						for (int k = 0; k < 4; k++) {
							int nX = dirX[k] + x;
							int nY = dirY[k] + y;
							
							if (nX >= 0 && nY >= 0 && nX < n && nY < n) {
								if (!visited[nX][nY] && arr[nX][nY] == 1) {
									visited[nX][nY] = true;
									que.offer(new int[] {nX, nY});
									cnt++;
								}
							}
						}
					}
					cntList.add(cnt);
				}
			}
		}
		Collections.sort(cntList);
		StringBuffer sb = new StringBuffer();
		sb.append(cntList.size()).append("\n");
		
		for (int i = 0; i < cntList.size(); i++) {
			sb.append(cntList.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
}

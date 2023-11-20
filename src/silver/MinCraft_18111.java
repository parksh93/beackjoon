package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinCraft_18111 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int [][] flow = new int [n][m];
		
		int maxNum = 0;
		int minNum = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int k =  Integer.parseInt(st.nextToken());
				maxNum = Math.max(maxNum, k);
				minNum = Math.min(minNum, k);
				flow[i][j] = k;
			}
		}

		int resultTime = Integer.MAX_VALUE;
		int resultHieth = 0;
		for (int i = minNum; i <= maxNum; i++) {
			int time = 0;
			int inven = b;
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if(i < flow[j][k]) {
						time += 2 * (flow[j][k] - i);
						inven += flow[j][k] - i;
					}else if(i > flow[j][k]) {
						time += (i - flow[j][k]);
						inven -= (i - flow[j][k]);
					}
				}
			}
			
			if(inven >= 0) {
				if(resultTime > time) {
					resultTime = time;
					resultHieth = i;
				}else if(resultTime == time) {
					resultHieth = Math.max(resultHieth, i);
				}
			}
			
		}
		
		System.out.println(resultTime + " " + resultHieth);
		
	}
}

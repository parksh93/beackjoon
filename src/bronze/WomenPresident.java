package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WomenPresident {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int [][] ar = new int [k+1][n+1];
			
			for (int j = 0; j < n; j++) {
				ar[0][j] = j+1;
			}
			
			for (int j = 1; j <= k; j++) {
				for (int m = 0; m < n; m++) {
					for (int l = 0; l <= m; l++) {
						ar[j][m] += ar[j-1][l];
					}
				}
			}
			
			System.out.println(ar[k][n-1]);
		}
		
	}
}

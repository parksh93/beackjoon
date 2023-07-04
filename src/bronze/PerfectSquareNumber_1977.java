package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSquareNumber_1977 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int totalSum = 0;
		int minNum = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int p = i / j;
				if (p == j && i % j ==0) {
					totalSum += i;
					minNum = Math.min(minNum, i);
				}
			}
		}
		
		if (totalSum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(totalSum);
			System.out.println(minNum);
		}
	}
}

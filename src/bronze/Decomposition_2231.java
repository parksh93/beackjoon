package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_2231 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int minNum = 0;
		
		for (int i = 1; i < n; i++) {
			String s = String.valueOf(i);
			int sum = i;
			for (int j = 0; j < s.length(); j++) {
				sum += Character.getNumericValue(s.charAt(j));
			}
			if (sum == n) {
				if (minNum == 0) {
					minNum = i;
				}else {
					minNum = Math.min(minNum, i);
				}
			}
		}
		System.out.println(minNum);
	}
}

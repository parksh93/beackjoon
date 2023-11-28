package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Honeycomb_2292 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int num = 1;
		int range = 6;
		
		while (num < n) {
			num += range;
			range += 6;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

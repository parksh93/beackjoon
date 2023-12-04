package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Coin_11047 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> coins = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int coin = Integer.parseInt(br.readLine());
			if(coin > k) break;
			
			coins.add(coin);
		}
		
		int sum = 0;
		int cnt = 0;
		for (int i = coins.size() - 1; i >= 0; i--) {
			while (sum + coins.get(i) <= k) {
				sum += coins.get(i);
				cnt++;
			}
			
			if (sum == k) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}

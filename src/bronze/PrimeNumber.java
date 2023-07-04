package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PrimeNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < cnt; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int result = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int primeNumCnt = 0;
			for (int j = 1; j <= list.get(i); j++) {
				if (list.get(i) % j == 0) {
					primeNumCnt++;
				}
			}
			if (primeNumCnt == 2) {
				result++;
			}
		}
		System.out.println(result);
	}
}

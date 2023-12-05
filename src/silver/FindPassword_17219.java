package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FindPassword_17219 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> memo = new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			memo.put(st.nextToken(), st.nextToken());
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < m; i++) {
			sb.append(memo.get(br.readLine())).append("\n");
		}
		
		System.out.println(sb);
	}
}

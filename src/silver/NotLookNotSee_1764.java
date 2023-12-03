package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class NotLookNotSee_1764 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> name = new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			name.put(str, str);
		}
		
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if(name.containsKey(str)) {
				result.add(str);
			}
		}

		Collections.sort(result);
		
		StringBuffer sb = new StringBuffer();
		sb.append(result.size()).append("\n");
		
		for (String str : result) {
			sb.append(str).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
	}
}

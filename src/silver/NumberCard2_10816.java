package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCard2_10816 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> nMap = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int nNum = Integer.parseInt(st.nextToken());
			
			if(nMap.get(nNum) == null) {
				nMap.put(nNum, 1);
			}else {
				nMap.put(nNum, nMap.get(nNum) + 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < m; i++) {
			int mNum = Integer.parseInt(st.nextToken());
			if (nMap.get(mNum) == null) {
				sb.append(0).append(" ");
			}else {
				sb.append(nMap.get(mNum)).append(" ");
			}
		}
	
		bw.write(sb.toString());
		bw.flush();
	}
}

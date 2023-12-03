package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PocketmonMasterLee_1620 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> pocketmonNumList = new HashMap<>();
		HashMap<String, Integer> pocketmonNameList = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String pocketmon = br.readLine();
			pocketmonNumList.put(String.valueOf(i + 1), pocketmon);
			pocketmonNameList.put(pocketmon, i + 1);
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < m; i++) {
			String quiz = br.readLine();
			String name = pocketmonNumList.get(quiz);
			
			if (name == null) {
				sb.append(pocketmonNameList.get(quiz));
			}else {
				sb.append(name);
			}
			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
	}
}

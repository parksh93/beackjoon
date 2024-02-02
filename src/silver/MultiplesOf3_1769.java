package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MultiplesOf3_1769 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String X = br.readLine();
		
		int cnt = 0;
		while(X.length() > 1) {
			int sum = 0;
			
			for (int i = 0; i < X.length(); i++) {
				sum += Character.getNumericValue(X.charAt(i));
			}

			X = String.valueOf(sum);
			cnt++;
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(cnt).append("\n");
		
		if(Integer.parseInt(X) % 3 == 0) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

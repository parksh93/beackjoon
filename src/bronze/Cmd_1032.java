package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Cmd_1032 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		String result = "";
		
		for (int i = 0; i < cnt; i++) {
			String text = br.readLine();
			
			if(result.equals("")) {
				result = text;
				continue;
			}
			for (int j = 0; j < text.length(); j++) {
				if(text.charAt(j) != result.charAt(j)) {
					StringBuilder sb = new StringBuilder(result);
					sb.setCharAt(j, '?');
					result = sb.toString();
				}
			}
		}
		
		bw.write(result);
		bw.flush();
		bw.close();
	}
}

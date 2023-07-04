package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum1_2_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int cnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cnt; i++) {
			int num = Integer.parseInt(br.readLine());
			int [] ar = new int [num+1];
		
			if(num == 0) {
				sb.append(0).append("\n");
			}else if(num == 1) {
				sb.append(1).append("\n");
			}else {
				ar[0] = 1;
				ar[1] = 1;
				ar[2] = 2;
				for (int j = 3; j <= num; j++) {
					ar[j] = ar[j-1] + ar[j-2] + ar[j-3];
					
				}
				sb.append(ar[num]).append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}

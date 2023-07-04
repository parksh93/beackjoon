package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class DistributedProcessing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int d = a;
			for (int j = 1; j < b; j++) {
				d *= a;
				
				if (d > 100) {
					d %= 100;
				}
			}
			
			String c = String.valueOf(String.valueOf(d).charAt(String.valueOf(d).length()-1));
			
			if (c.equals("0")) {
				c = "10";
			}
			sb.append(c).append("\n");
		}
		
		System.out.println(sb);
	}
}

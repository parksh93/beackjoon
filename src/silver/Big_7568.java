package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Big_7568 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] peoples = new int [n][2];
		
		for (int i = 0; i < peoples.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			peoples[i][0] = Integer.parseInt(st.nextToken()); 
			peoples[i][1] = Integer.parseInt(st.nextToken()); 
		}
		
		int [] result = new int [n];
		
		for (int i = 0; i < peoples.length; i++) {
			for (int j = 0; j < peoples.length; j++) {
				if(i == j) { 
					continue;
				}
				
				if(peoples[i][0] < peoples[j][0] && peoples[i][1] < peoples[j][1]) {
					result[i] += 1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i] + 1).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

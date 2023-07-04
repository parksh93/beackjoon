package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinOfX {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < cnt; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (num > a) {
				System.out.print(a + " ");
			}
		}
		
	}
}

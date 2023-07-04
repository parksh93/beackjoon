package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RightTriangle {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int num [] = new int [3];
			
			num[0] = Integer.parseInt(st.nextToken());
			num[1] = Integer.parseInt(st.nextToken());
			num[2] = Integer.parseInt(st.nextToken());
			
			if (num[0]==0&&num[1]==0&num[2]==0) break;
			
			Arrays.sort(num);
			
			int a = num[0];
			int b = num[1];
			int c = num[2];
			
			if (a*a + b*b == c*c) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
		
	}
}

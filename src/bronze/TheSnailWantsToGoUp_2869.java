package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TheSnailWantsToGoUp_2869 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		// 점정에 도달했을 때 미끄러지지 않기에 전체 길이에서 미끄러지는 값을 빼줘야 한다.
		int day = (v - b) / (a - b);
	
		if((v - b) % (a - b) != 0) {
			day++;
		}
		
		bw.write(String.valueOf(day));
		bw.flush();
		
	}
}

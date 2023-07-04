package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int wCnt = 1;
			if(h < n){
				int minusH = n;
				while (minusH > h) {
					minusH -= h;
					wCnt++;
				}
				
				if (wCnt >= 10) {
					System.out.println(minusH + "" + wCnt);
				}else {
					System.out.println(minusH + "0" + wCnt);					
				}
			}else {
				System.out.println(n + "01");
			}
		}
	}
}

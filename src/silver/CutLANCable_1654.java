package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutLANCable_1654 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int [] lans = new int [k];
		
		long maxLan = 0;
		long minLan = 0;
		for (int i = 0; i < lans.length; i++) {
			int lan = Integer.parseInt(br.readLine());
			maxLan = Math.max(maxLan, lan);
			minLan = Math.min(minLan, lan);
			lans[i] = lan;
		}
		
		
		maxLan++;
		
		while(minLan < maxLan) {
			long mid = (maxLan + minLan) / 2;
			
			long cnt = 0;
			
			for (int i = 0; i < lans.length; i++) {
				cnt += lans[i] / mid;
			}
			
			if(cnt < n) {
				maxLan = mid;
			}else {
				minLan = mid + 1;
			}
		}
		
		System.out.println(minLan - 1);
	}
}

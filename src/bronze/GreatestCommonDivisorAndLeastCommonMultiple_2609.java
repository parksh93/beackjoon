package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GreatestCommonDivisorAndLeastCommonMultiple_2609 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<Integer> nList = new ArrayList<Integer>();
		
		nList.add(1);
		
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				nList.add(i);
			}
		}
		nList.add(n);
		
		int result1 = 0;
		for (int i = 0; i < nList.size(); i++) {
			if(m % nList.get(i) == 0) {
				if (result1 < nList.get(i)) {
					result1 = nList.get(i);
				}
			}
		}
		
		int i = 1;
		int result2 = 0;
		while (true) {
			if (n * i % m == 0) {
				result2 = n * i;
				break;
			}
			i++;
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(result1).append("\n").append(result2);
		
		bw.write(sb.toString());
		bw.flush();
	}
}

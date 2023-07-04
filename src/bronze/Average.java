package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> numList = new ArrayList<>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < cnt; i++) {
			numList.add(Double.parseDouble(st.nextToken()));
		}
		
		Collections.sort(numList);
		
		double newTotal = 0;
		for (int i = 0; i < numList.size(); i++) {
			newTotal += numList.get(i)/numList.get(cnt-1)*100;
		}
		
		System.out.println(newTotal/(double)cnt);
	}
}

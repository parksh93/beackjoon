package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EasyPloblem_1292 {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
				
		List<Integer> numbers = new ArrayList<Integer>();
		

		for (int i = 1; i < 1000; i++) {
			if(numbers.size() >= end) {
				break;
			}
			for (int j = 0; j < i; j++) {
				numbers.add(i);
			}				
		}
	
		int result = 0;
		for (int i = start; i <= end; i++) {
			result += numbers.get(i-1);
		}
		
		System.out.println(result);
	}
}

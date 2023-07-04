package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Divisor {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> num = new ArrayList<>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < cnt; i++) {
			num.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(num);
		
		System.out.println(num.get(0) * num.get(num.size()-1));
		
	}
}

package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class IndexMeasure {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		List<Integer> measure = new ArrayList<>();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				measure.add(i);
			}
		}
		try {
			System.out.println(measure.get(k-1));			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(0);
		}
		
	}
}

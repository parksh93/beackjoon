package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolvedAc_18110 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> opinions = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			opinions.add(Integer.parseInt(br.readLine()));
		}
		
		int avgPerson = (int)Math.round(n * 0.15);
		
		Collections.sort(opinions, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) {
					return -1;
				}else if(o1 > o2) {
					return 1;
				}
				
				return 0;
			}
		});
		
		int total = 0;
		for (int i = avgPerson; i < opinions.size() - avgPerson; i++) {
			total += opinions.get(i);
		}
		
		System.out.println(Math.round(total / (double)(opinions.size() - avgPerson * 2)));
	}
}

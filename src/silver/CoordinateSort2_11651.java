package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class CoordinateSort2_11651 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		List<List<Integer>> cdns = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			List<Integer> cdn = new ArrayList<Integer>();
			cdn.add(Integer.parseInt(st.nextToken()));
			cdn.add(Integer.parseInt(st.nextToken()));
			cdns.add(cdn);
		}
		
		Collections.sort(cdns, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				if(o1.get(1) < o2.get(1)) {
					return -1;
				}else if(o1.get(1).equals(o2.get(1))) {
					if(o1.get(0) < o2.get(0)) {
						return -1;
					}else if(o1.get(0) > o2.get(0)) {
						return 1;
					}else {
						return 0;
					}
				}
				
				return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (List<Integer> cdn : cdns) {
			sb.append(cdn.get(0)).append(" ").append(cdn.get(1)).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

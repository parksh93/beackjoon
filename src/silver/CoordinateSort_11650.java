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

public class CoordinateSort_11650 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		List<List<Integer>> crds = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < n; i++) {
			List<Integer> crd = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			crd.add(Integer.parseInt(st.nextToken()));
			crd.add(Integer.parseInt(st.nextToken()));
			
			crds.add(crd);
		}
		
		Collections.sort(crds, new Comparator<List<Integer>>() {

			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				if(o1.get(0) < o2.get(0)) {
					return -1;
				}else if(o1.get(0).equals(o2.get(0))) {
					if(o1.get(1) < o2.get(1)) {
						return -1;
					}else if(o1.get(1) > o2.get(1)) {
						return 1;
					}
				}else {
					return 1;
				}
				
				return 0;
			}
		});
		
		StringBuffer sb = new StringBuffer();
		for (List<Integer> crd : crds) {
			sb.append(crd.get(0)).append(" ").append(crd.get(1)).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

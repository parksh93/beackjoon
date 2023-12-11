package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AbsoluteValueHeap_11286 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int absO1 = Math.abs(o1);
				int absO2 = Math.abs(o2);
				if(absO1 < absO2) {
					return -1;
				}else if(absO1 == absO2) {
					if (o1 < o2) {
						return -1;
					}else if(o1 > o2){
						return 1;
					}else {
						return 0;
					}
				}
				return 1;
			}
			
		});
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			int m  = Integer.parseInt(br.readLine());
			if(m == 0) {
				if (que.isEmpty()) {
					sb.append(0).append("\n");
				}else {
					sb.append(que.poll()).append("\n");
				}
			}else {
				que.add(m);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

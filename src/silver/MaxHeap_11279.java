package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap_11279 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			
			if(m == 0) {
				if(que.isEmpty()) {
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

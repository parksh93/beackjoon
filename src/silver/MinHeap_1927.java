package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class MinHeap_1927 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			if(m == 0) {
				if(pQueue.isEmpty()) {
					sb.append(0).append("\n");
				}else {
					sb.append(pQueue.poll()).append("\n");
				}
			}else {
				pQueue.add(m);
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}

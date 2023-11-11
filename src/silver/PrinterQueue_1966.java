package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQueue_1966 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			Queue<Integer> que = new LinkedList<Integer>();
			
			for (int j = 0; j < n; j++) {
				que.add(Integer.parseInt(st.nextToken()));
			}

			int cnt = 0;
			
			while (true) {
				Iterator<Integer> iter = que.iterator();
				
				int first = que.peek();
				boolean check = false;
				while (iter.hasNext()) {
					if(first < iter.next()) {
						check = true;
						break;
					}
				}
				
				if(check) {
					if(m == 0) {
						que.add(que.poll());
						m = que.size() - 1;
					}else {
						que.add(que.poll());
						m--;
					}
				}else {
					cnt++;
					if(m == 0) {
						break;
					}else {
						que.poll();
						m--;
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

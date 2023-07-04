package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SpinningQueue_1021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> deq = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for(int i = 1; i <= N; i++) {
			deq.offer(i);
		}
		
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int K = Integer.parseInt(st.nextToken());
			int KIdx = deq.indexOf(K);
			
			if (KIdx > deq.size()/2) {
				while (true) {
					if (deq.peek() == K) {
						deq.poll();
						break;
					}else{
						deq.offerFirst(deq.pollLast());
						cnt++;
					}
				}
			}else {
				while(true) {
					if (deq.peek() == K) {
						deq.poll();
						break;
					}else{
						deq.offerLast(deq.poll());
						cnt++;
					}
				}
			}
			
		}
		
		System.out.println(cnt);
		
	}
}

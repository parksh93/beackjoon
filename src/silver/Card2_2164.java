package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_2164 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			que.add(i);
		}
		
		while (que.size() > 1) {
			que.poll();
			que.offer(que.poll());
		}
		
		System.out.println(que.poll());
	}
}

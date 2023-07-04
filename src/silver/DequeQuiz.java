
package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class DequeQuiz {
	public static void dequeMethod(String deqKeyword, Deque<Integer> d) {
		int num = 0;
		
		if (deqKeyword.contains("push")) {
			String [] s = deqKeyword.split(" ");
			
			deqKeyword = s[0];
			num = Integer.parseInt(s[1]);
		}
		
		switch (deqKeyword) {
		case "push_front":
			d.offerFirst(num);
			break;
		case "push_back":
			d.offerLast(num);
			break;
		case "pop_front":
			if (!d.isEmpty()) {
				System.out.println(d.pollFirst());
			}else {
				System.out.println(-1);
			}
			break;
		case "pop_back":
			if(!d.isEmpty()) {
				System.out.println(d.pollLast());
			}else {
				System.out.println(-1);
			}
			break;
		case "size":
			System.out.println(d.size());
			break;
		case "empty":
			if (d.isEmpty()) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			break;
		case "front":
			if(!d.isEmpty()) {
				System.out.println(d.peekFirst());
			}else {
				System.out.println(-1);
			}
			break;
		case "back":
			if(!d.isEmpty()) {
				System.out.println(d.peekLast());
			}else {
				System.out.println(-1);
			}
			break;
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cnt; i++) {
			dequeMethod(br.readLine(), deque);
		}
		
	}
}

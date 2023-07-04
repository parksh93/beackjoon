package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackQuiz {
	public static void stackMethod(String stackKeyword, Stack<Integer> s) {

		int num = 0;
		if (stackKeyword.contains("push")) {
			String[] pushSplit = stackKeyword.split(" ");
			stackKeyword = pushSplit[0];
			num = Integer.parseInt(pushSplit[1]);
		}

		switch (stackKeyword) {
		case "push":
			s.push(num);
			break;
		case "pop":
			if (!s.empty()) {
				System.out.println(s.pop());
			} else {
				System.out.println("-1");
			}
			break;
		case "size":
			System.out.println(s.size());
			break;
		case "empty":
			if (s.empty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			break;
		case "top":
			if (!s.empty()) {
				System.out.println(s.peek());
			} else {
				System.out.println("-1");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s = new Stack<>();

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			stackMethod(br.readLine(), s);
		}
	}
}

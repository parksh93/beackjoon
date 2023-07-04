package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class QueuekQuiz {
	public static void queueMethod(String queueKeyword, List<Integer> q) {

		int num = 0;
		if (queueKeyword.contains("push")) {
			String[] pushSplit = queueKeyword.split(" ");
			queueKeyword = pushSplit[0];
			num = Integer.parseInt(pushSplit[1]);
		}

		switch (queueKeyword) {
		case "push":
			q.add(num);
			break;
		case "pop":
			if (!q.isEmpty()) {
				System.out.println(q.get(0));
				q.remove(0);
			} else {
				System.out.println("-1");
			}
			break;
		case "size":
			System.out.println(q.size());
			break;
		case "empty":
			if (q.isEmpty()) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			break;
		case "front":
			if (!q.isEmpty()) {
				System.out.println(q.get(0));
			} else {
				System.out.println("-1");
			}
			break;
		case "back":
			if (!q.isEmpty()) {
				System.out.println(q.get(q.size()-1));
			} else {
				System.out.println("-1");
			}
			break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> queue = new LinkedList<>();

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			queueMethod(br.readLine(), queue);
		}
	}
}

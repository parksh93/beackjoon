package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MaxMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		List<Integer> numList = new ArrayList<>();

		int num = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(bf.readLine(), " ");
		for (int i = 0; i < num; i++) {
			numList.add(Integer.parseInt(st.nextToken()));
		}

		int maxNum = numList.get(0);
		int minNum = numList.get(0);

		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) > maxNum) {
				maxNum = numList.get(i);
			}
		}
		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) < minNum) {
				minNum = numList.get(i);
			}
		}

		System.out.println(minNum + " " + maxNum);
	}
}

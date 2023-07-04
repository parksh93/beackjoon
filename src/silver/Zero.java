package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> numList = new Stack<>();
		
		int numCnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numCnt; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (!numList.isEmpty()) {
					numList.pop();
				}
			}else {
				numList.add(num);
			}
		}
		
		int result = 0;
		
		while (!numList.isEmpty()) {
			result += numList.pop();
		}
		
		System.out.println(result);
	}
}

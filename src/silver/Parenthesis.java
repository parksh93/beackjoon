package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		int cntInput = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cntInput; i++) {
			String inPar = br.readLine();
			
			for (int j = 0; j < inPar.length(); j++) {
				if (inPar.charAt(j) == '(') {
					stack.add(inPar.charAt(j));
				}else {
					if (!stack.isEmpty()&&stack.contains('(')) {
						stack.pop();
					}else {
						stack.add(inPar.charAt(j));
					}
				}
			}
			
			if (stack.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}

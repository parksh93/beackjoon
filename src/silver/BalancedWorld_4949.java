package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BalancedWorld_4949 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			
			Stack<Character> stack = new Stack<Character>();
			Stack<Character> trash = new Stack<Character>();
			
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (c == '(' || c == '[') {
					stack.add(c);
				}else if(c == ')') {
					if(!stack.isEmpty()) {
						if(stack.peek() == '(') {
							stack.pop();
						}else {
							trash.add(c);
						}
					}else {
						trash.add(c);
					}
				}else if(c == ']') {
					if(!stack.isEmpty()) {
						if(stack.peek() == '[') {
							stack.pop();
						}else {
							trash.add(c);
						}
					}else {
						trash.add(c);
					}
				}
			}
			
			if(stack.isEmpty() && trash.isEmpty()) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		StringBuffer sb = new StringBuffer();
		String t = br.readLine();
		
		for (int i = 0; i < t.length(); i++) {
			stack1.add(t.charAt(i));
		}
		
		
		char pText = 0;
		int cnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String edi = st.nextToken();
			
			if (edi.equals("P")) {
				pText = st.nextToken().charAt(0);
			}
			switch (edi) {
			case "L": 
				if (!stack1.isEmpty()) {
					stack2.add(stack1.pop());
				}
				break;
			case "D" :
				if (!stack2.isEmpty()) {
					stack1.add(stack2.pop());
				}
				break;
			case "B" :
				if (!stack1.isEmpty()) {
					stack1.pop();
				}
				break;
			case "P" : 
				stack1.add(pText);
				break;
			}
			
			
		}
		while(!stack1.isEmpty()) {
			stack2.add(stack1.pop());
		}
		
		while(!stack2.isEmpty()) {
			sb.append(stack2.pop());
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}

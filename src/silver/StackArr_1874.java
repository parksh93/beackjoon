package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class StackArr_1874 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
	
		StringBuffer sb = new StringBuffer();
		
		StringBuffer input = new StringBuffer();
		StringBuffer result = new StringBuffer();
		
		int j = 1;
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			input.append(String.valueOf(m));
			
			while(j <= n) {
				if(stack.size() != 0) {
					if(stack.peek() == m) {
						result.append(String.valueOf(stack.pop()));
						sb.append("-").append("\n");
						break;
					}else {
						stack.push(j);
						sb.append("+").append("\n");
						j++;
					}
				}else {
					stack.push(j);
					sb.append("+").append("\n");
					j++;
				}
			}
		}
		
		
		while(!stack.isEmpty()) {
			result.append(String.valueOf(stack.pop()));
			sb.append("-").append("\n");
		}
		
		if(input.toString().equals(result.toString())) {
			bw.write(sb.toString());
		}else {
			bw.write("NO");
		}
		bw.flush();
	}
}

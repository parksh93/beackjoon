package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSycle {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String a = "";
		int cnt = 0;
		String changNum = "";
		
		if (n < 10) {
			a = "0" + String.valueOf(n);
		}else {
			a = String.valueOf(n);
		}
		
		while (true) {
			if (changNum.equals(a)) {
				System.out.println(cnt);
				break;
			}else {
				if (changNum.equals("")) {
					changNum = a;
				}
				int c = 0;
				for (int i = 0; i < changNum.length(); i++) {
					c += Character.getNumericValue((changNum.charAt(i)));
					
				}
				String cS = String.valueOf(c);
				
				changNum = String.valueOf(changNum.charAt(changNum.length()-1)) + String.valueOf(cS.charAt(cS.length()-1)); 
				cnt++;
			}
		}
	}
}

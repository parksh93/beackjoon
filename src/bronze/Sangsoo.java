package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sangsoo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String [] newNum = {"",""};
		
		for (int i = 0; i < 2; i++) {
			String num = st.nextToken();
			for (int j = num.length()-1; j >= 0 ; j--) {
				newNum[i] += String.valueOf(num.charAt(j));
			}
		}
		
		if (Integer.parseInt(newNum[0]) > Integer.parseInt(newNum[1])) {
			System.out.println(newNum[0]);
		}else if(Integer.parseInt(newNum[0]) < Integer.parseInt(newNum[1])) {
			System.out.println(newNum[1]);			
		}
	}
}

package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrangeMult_1225 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		long result = 0;
		for (int i = 0; i < a.length(); i++) {
			int aNum = Character.getNumericValue(a.charAt(i));
					
			for (int j = 0; j < b.length(); j++) {
				int bNum = Character.getNumericValue(b.charAt(j));
				
				result += aNum * bNum;
			}
		}
		
		System.out.println(result);
	}
}

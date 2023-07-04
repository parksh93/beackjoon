package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneNumCompatibility {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num1 = br.readLine();
		String num2 = br.readLine();

		String sumNum = "";

		for (int i = 0; i < 8; i++) {
			sumNum += num1.charAt(i); 
			sumNum += num2.charAt(i); 
		}

		while (sumNum.length() > 2) {
			String c = "";
			for (int i = 0; i < sumNum.length() - 1; i++) {
				int s = Character.getNumericValue(sumNum.charAt(i)) + Character.getNumericValue(sumNum.charAt(i+1));
				if (s >= 10) {
					c += String.valueOf(s).charAt(1);
				} else {
					c += String.valueOf(s);
				}
			}
			sumNum = c;
		}
		
		System.out.println(sumNum);
	}
}

package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resistance {
	public static String selectValue(String val) {
		switch (val) {
		case "black":
			return "0";
		case "brown":
			return "1";
		case "red":
			return "2";
		case "orange":
			return "3";
		case "yellow":
			return "4";
		case "green":
			return "5";
		case "blue":
			return "6";
		case "violet":
			return "7";
		case "grey":
			return "8";
		case "white":
			return "9";
		}
		return "";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String val1 = selectValue(br.readLine());
		String val2 = selectValue(br.readLine());
		String val3 = selectValue(br.readLine());

		String sumNum12 = val1 + val2;
		String num3 = "1";
		
		for (int i = 0; i < Integer.parseInt(val3); i++) {
				num3 += "0";
		}

		long re1 = Integer.parseInt(sumNum12);
		long re2 = Integer.parseInt(num3);
		long resulte = re1 * re2;
		
		System.out.println(resulte);
	}
}

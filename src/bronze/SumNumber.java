package bronze;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String num = sc.next();
		
		int sumNum = 0;
		for (int i = 0; i < cnt; i++) {
			sumNum += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(sumNum);
	}
}

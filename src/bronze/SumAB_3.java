package bronze;

import java.util.Scanner;

public class SumAB_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println(num1 + num2);
		}
	}
}

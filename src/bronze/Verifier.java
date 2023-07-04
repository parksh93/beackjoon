package bronze;

import java.util.Scanner;

public class Verifier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalNum = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			totalNum += num*num;
		}
		System.out.println(totalNum % 10);
	}
}

package bronze;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ramain {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int [] inputNum = new int[10];
		Set<Integer> remainNum = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			inputNum[i] = sc.nextInt();
		}
		
		for (int i = 0; i < inputNum.length; i++) {
			remainNum.add(inputNum[i] % 42);
		}

		System.out.println(remainNum.size());
	}
}

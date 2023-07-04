package bronze;

import java.util.Scanner;

public class StudyWord3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next().toUpperCase();
		
		//알파벳 26자를 담음
		int [] ar = new int [26];
		
		for (int i = 0; i < t.length(); i++) {
			int idx = t.charAt(i) - 'A';
			ar[idx]++;
		}
		
		int max = 0;
		char result = '?';
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				result = (char)(i+ 'A');
			}else if(max == ar[i]) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}

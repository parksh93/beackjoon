package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchAlphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z' };
		int[] n = new int[26];

		for (int i = 0; i < n.length; i++) {
			n[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < c.length; j++) {
				if (s.charAt(i) == c[j]) {
					if (n[j] == -1) {
						n[j] = i;						
					}
				}
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}

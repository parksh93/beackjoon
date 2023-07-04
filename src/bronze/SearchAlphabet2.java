package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchAlphabet2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int[] n = new int[26];

		for (int i = 0; i < n.length; i++) {
			n[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			int j = s.charAt(i) - 'a';
			if (n[j] == -1) {
				n[j] = i;						
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}
}

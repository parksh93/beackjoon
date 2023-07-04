package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basketball {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean visited [] = new boolean[n];
		char [] name = new char [n];
		List<Character> result = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			name[i] = br.readLine().charAt(0);
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < name.length; i++) {
			int cnt = 1;
			visited[i] = true;
			for (int j = 0; j < name.length; j++) {
				if (!visited[j]) {
					if (name[i] == name[j]) {
						visited[j] = true;
						cnt++;
					}
				}
			}
			if (cnt >= 5) {
				result.add(name[i]);
			}
		}
		
		
		if (result.size() == 0) {
			System.out.println("PREDAJA");
		}else {
			Collections.sort(result);
			for (Character c : result) {
				System.out.print(c);
			}
		}
	}
}

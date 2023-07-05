package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WordOrder_1182_collectionSort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<String> stL = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (!stL.contains(s)) {
				stL.add(s);
			}
		}

		Collections.sort(stL, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length()) {
					return -1;
				}else if(s1.length() > s2.length()) {
					return 1;
				}else {
					for (int i = 0; i < s1.length(); i++) {
						if (s1.charAt(i) < s2.charAt(i)) {
							return -1;
						}else if(s1.charAt(i) > s2.charAt(i)) {
							return 1;
						}
					}
				}
				return 0;
			};
			
		});

		StringBuffer sb = new StringBuffer();
		for (String i : stL) {
			sb.append(i).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

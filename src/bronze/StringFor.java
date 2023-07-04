package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringFor {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int forNum = Integer.parseInt(st.nextToken());
			String text = st.nextToken();
			for (int j = 0; j < text.length(); j++) {
				for (int k = 0; k < forNum; k++) {
					System.out.print(text.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

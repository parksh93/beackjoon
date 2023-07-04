package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSquar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int[][] ar = new int[x][y];

		// 입력부
		for (int i = 0; i < ar.length; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = Character.getNumericValue(s.charAt(j));
			}
		}

		int min = Math.min(x, y);
		int result = 1;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				for (int k = 1; k <= min; k++) {
					if (i + k > x-1 || j + k > y-1) {
						break;
					}
					else if (ar[i][j] == ar[i][j + k] && ar[i][j] == ar[i + k][j] && ar[i][j] == ar[i + k][j + k]) {
						int re = (i + k - i + 1) * (j + k - j + 1);
						if (result < re) {
							result = re;
						}
					}
				}
			}
		}

		System.out.println(result);
	}
}

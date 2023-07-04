package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] cards = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}

		int maxNum = 0;
		outer: for (int i = 0; i < cards.length - 2; i++) {
			for (int j = i + 1; j < cards.length - 1; j++) {
				for (int k = j + 1; k < cards.length; k++) {
					int sum = cards[i] + cards[j] + cards[k];

					if (sum <= m) {
						if (sum == m) {
							maxNum = sum;
							break outer;
						}

						if (sum > maxNum) {
							maxNum = sum;
						}
					}
				}
			}
		}
		
		System.out.println(maxNum);
	}
}

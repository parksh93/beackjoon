package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SugarDelivery {
	static int cnt = 0;

	public static int sugarMod(int n) {
		if (n == 0) {
			return cnt;
		}
		if ((n % 5 >= 3 || n % 5 == 0) && (n - 5 >= 5 || n - 5 == 0)) {
			cnt++;
			return sugarMod(n - 5);
		} else if (n - 3 >= 3 || n - 3 == 0) {
			cnt++;
			return sugarMod(n - 3);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(sugarMod(n)));
		bw.flush();
		bw.close();
	}
}

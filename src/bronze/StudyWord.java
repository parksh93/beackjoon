package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudyWord {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Character> cT = new ArrayList<>();

		String t = bf.readLine().toLowerCase();

		for (int i = 0; i < t.length(); i++) {
			cT.add(t.charAt(i));
		}

		int maxDepCnt = 0;
		char depText = 0;
		int twoDepCnt = 0;

		for (int i = 0; i < cT.size(); i++) {
			int depCnt = Collections.frequency(cT, t.charAt(i));
			if (maxDepCnt < depCnt) {
				maxDepCnt = depCnt;
				depText = t.charAt(i);
			} else if (maxDepCnt == depCnt && depText != t.charAt(i)) {
				twoDepCnt++;
			}
		}

		if (twoDepCnt > 0) {
			bw.write("?");
		} else {
			bw.write(depText - 32);
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}

package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class WordOrder_1181_SelectSort {
	static List<String> stL = new ArrayList<>();

	public static void tmpM(int i, int j) {
		String tmp = stL.get(i);
		stL.set(i, stL.get(j));
		stL.set(j, tmp);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (!stL.contains(s)) {
				stL.add(s);
			}
		}

		for (int i = 0; i < stL.size(); i++) {
			for (int j = i + 1; j < stL.size(); j++) {
				if (stL.get(i).length() > stL.get(j).length()) {
					tmpM(i, j);

				} else if (stL.get(i).length() == stL.get(j).length()) {
					for (int k = 0; k < stL.get(i).length(); k++) {
						if (stL.get(i).charAt(k) < stL.get(j).charAt(k)) {
							break;
						}
						if (stL.get(i).charAt(k) > stL.get(j).charAt(k)) {
							tmpM(i, j);
							break;
						}
					}
				}
			}
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < stL.size(); i++) {
			sb.append(stL.get(i)).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}

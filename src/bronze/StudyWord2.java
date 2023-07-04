package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class StudyWord2 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Character> cT = new ArrayList<>();
		
		String t = bf.readLine();
		
		t = t.toUpperCase();
		
		for (int i = 0; i < t.length(); i++) {
			cT.add(t.charAt(i));
		}
		
		int maxCnt = -1;
		int twoMaxCnt = 0;
		char maxchar = 0;
		
		for (int i = 0; i < cT.size(); i++) {
			int cnt = 0;
			for (int j = 1+i; j < cT.size(); j++) {
				if (cT.get(i) == cT.get(j)) {
					cnt++;
				}
			}
			
			if (maxCnt < cnt) {
				maxCnt = cnt;
				maxchar = cT.get(i);
			}else if(maxCnt == cnt && maxCnt > 0 && cT.get(i) != maxchar) {
				twoMaxCnt++;
			}
		}
		
		if (twoMaxCnt > 0 || maxCnt == 0) {
			bw.write("?");
		}else {
			bw.write(maxchar);
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}

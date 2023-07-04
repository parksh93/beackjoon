package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AgeSort {
	public static void main(String[] args) throws IOException{
		//시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(br.readLine());
		String [] user = new String [cnt];
		
		for (int i = 0; i < cnt; i++) {
			user[i] = br.readLine(); 
		}
		
		int minNum = 0;
		
		for (int i = 0; i < user.length; i++) {
			minNum = i;
			for (int j = i+1; j < user.length; j++) {
				int userNum = Integer.parseInt(user[j].substring(0, user[j].indexOf(" ")));
				int minNums = Integer.parseInt(user[minNum].substring(0, user[minNum].indexOf(" ")));
				if (minNums > userNum) {
					minNum = j;
				}
				
			}
			String tmp = user[i];
			user[i] = user[minNum];
			user[minNum] = tmp;
		}
		
		for (int i = 0; i < user.length; i++) {
			sb.append(user[i]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}

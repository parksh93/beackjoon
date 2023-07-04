package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AgeSort2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(br.readLine());
		String [] user = new String [cnt];
		String [] result = new String [cnt];
		int [] countNum = new int[201];
		
		for (int i = 0; i < cnt; i++) {
			user[i] = br.readLine(); 
		}
		
		for (int i = 0; i < user.length; i++) {
			int userNum = Integer.parseInt(user[i].substring(0, user[i].indexOf(" ")));
			countNum[userNum]++;
		}
		
		for (int i = 1; i < countNum.length; i++) {
			countNum[i] += countNum[i-1];
		}
		
		
		//마지막부터 대입
		for (int i = user.length-1; i >= 0 ; i--) {
			int userNum = Integer.parseInt(user[i].substring(0, user[i].indexOf(" ")));
			countNum[userNum]--;
			result[countNum[userNum]] = user[i];
		}
		
		
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}

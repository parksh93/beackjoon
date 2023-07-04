package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scale {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int [] ascending = {1,2,3,4,5,6,7,8};
		int [] descending = {8,7,6,5,4,3,2,1};
		
		int ascCnt = 0;
		int decCnt = 0;
		for (int i = 0; i < 8; i++) {
			int userIn = Integer.parseInt(st.nextToken());
			
			if(ascending[i] == userIn) {
				ascCnt++;
			}
			if(descending[i] == userIn) {
				decCnt++;
			}
		}
		
		if (ascCnt == 8) {
			System.out.println("ascending");
		}else if(decCnt == 8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}

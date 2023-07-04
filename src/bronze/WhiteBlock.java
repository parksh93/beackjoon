package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteBlock {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			String line = br.readLine();
			for (int j = 0; j < 8; j++) {
				if ((i+1) % 2 == 1) {
					if ((j+1) % 2 == 1 && line.charAt(j) == 'F') {
						cnt++;
					}
				}else {
					if ((j+1) % 2 == 0 && line.charAt(j) == 'F') {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}

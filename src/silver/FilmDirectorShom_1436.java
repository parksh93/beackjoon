package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FilmDirectorShom_1436 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int result = 666;
		while(cnt < n) {
			result++;
			if(String.valueOf(result).contains("666")){
				cnt++;
			}
			
		}
		
		System.out.println(result);
	}
}

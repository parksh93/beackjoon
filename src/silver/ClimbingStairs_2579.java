package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClimbingStairs_2579 {
	static int [] ar;
	static int [] score;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		ar = new int [num];
		score = new int [num];
		
		for (int i = 0; i <= num; i++) {

			ar[i] = Integer.parseInt(br.readLine());
		}
		
		score[0] = ar[0] + ar[1];
		score[1] = Math.max(ar[0], ar[1]) + ar[2];
		
		for (int j = 3; j < ar.length; j++) {
			score[j-1] = Math.max(score[j-3], score[j-2]) + ar[j];
		}
			
		
		System.out.println(Arrays.toString(score));
		
	}
}

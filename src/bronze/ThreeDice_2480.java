package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeDice_2480 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int dice [] = new int [3];
		dice[0] = Integer.parseInt(st.nextToken());
		dice[1] = Integer.parseInt(st.nextToken());
		dice[2] = Integer.parseInt(st.nextToken());
		
		int sameNum = 0;
		
		int result = 0;
		if(dice[0] == dice[1] && dice[0] == dice[2]) {
			result = 10000 + dice[0] * 1000;
		}else if(dice[0] == dice[1] && dice[0] != dice[2]) {
			result = 1000 + dice[0] * 100;
		}
		else if(dice[0] == dice[2] && dice[0] != dice[1]) {
			result = 1000 + dice[0] * 100;
		}
		else if(dice[1] == dice[2] && dice[0] != dice[2]) {
			result = 1000 + dice[1] * 100;
		}
		else {
			for (int i = 0; i < dice.length; i++) {
				if(sameNum < dice[i]) {
					sameNum = dice[i];
				}
			}
			
			result = sameNum * 100;
		}
		
		System.out.println(result);
	}
}

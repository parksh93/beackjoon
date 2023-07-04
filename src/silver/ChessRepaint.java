package silver;

import java.util.Scanner;

public class ChessRepaint {
	public static int distance = 0;
	public static boolean map[][];


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int xFrame = sc.nextInt();
		int yFrame = sc.nextInt();
		
		int answer = Integer.MAX_VALUE;
		
		map = new boolean[xFrame][yFrame];
		for(int i=0; i<xFrame; i++) {
			String input = sc.next();
			for(int j=0; j<yFrame; j++)	map[i][j] = changer(input.charAt(j));
		}

		for(int i=0; i<xFrame-7; i++) {
			for(int j=0; j<yFrame-7; j++) {
				answer = Math.min(answer, bf(i, j));
			}
		}
		System.out.println(answer);
	}
	
	public static int bf(int startX, int startY) {
		boolean horse = map[startX][startY];
		int cnt=0;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				int nowX = startX + i;
				int nowY = startY + j;
				int sum = i+j;
				if( (sum%2==0 && horse!=map[nowX][nowY]) || (sum%2==1 && horse==map[nowX][nowY]) )cnt++;
			}
		}
		return Math.min(64-cnt, cnt);
	}
	public static boolean changer(char in) {
		if(in=='W') return true;
		else return false;
	}
}

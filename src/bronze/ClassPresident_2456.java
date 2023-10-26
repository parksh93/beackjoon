package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClassPresident_2456 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentCnt = Integer.parseInt(br.readLine());
		
		int [][] scores = new int [3][studentCnt];
		int [] totalScores = new int [3];
		
		for (int i = 0; i < studentCnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 3; j++) {
				int score = Integer.parseInt(st.nextToken());
				totalScores[j] += score;
				scores[j][i] = score;
			}
		}
	
		int mostScore = 0;
		int mostScorePrNum = 0;
		boolean doubleCheck = false;
		for (int i = 0; i < totalScores.length; i++) {
			if(mostScore < totalScores[i]) {
				mostScore = totalScores[i];
				mostScorePrNum = i + 1;
				doubleCheck = false;
			}else if(mostScore == totalScores[i]) {
				int threeCnt1 = 0;
				int threeCnt2 = 0;
				
				for (int j = 0; j < studentCnt; j++) {
					if(scores[mostScorePrNum - 1][j] == 3) {
						threeCnt1 += 1;
					}
					if(scores[i][j] == 3) {
						threeCnt2 += 1;
					}
				}
				
				if(threeCnt1 < threeCnt2) {
					doubleCheck = false;
					mostScorePrNum = i + 1;
				}else if(threeCnt1 == threeCnt2) {
					int twoCnt1 = 0;
					int twoCnt2 = 0;
					
					for (int j = 0; j < studentCnt; j++) {
						if(scores[mostScorePrNum - 1][j] == 2) {
							twoCnt1 += 1;
						}
						if(scores[i][j] == 2) {
							twoCnt2 += 1;
						}
					}
					if(twoCnt1 == 0 && twoCnt2 == 0) {
						doubleCheck = true;
					}else {
						if(twoCnt1 < twoCnt2) {
							doubleCheck = false;
							mostScorePrNum = i + 1;
						}else if(twoCnt1 == twoCnt2) {
							doubleCheck = true;							
						}
					}
				}
			}
		}
		
		if(doubleCheck) {
			System.out.println("0 " + mostScore);			
		}else {
			System.out.println(mostScorePrNum + " " + mostScore);			
		}
	}
}

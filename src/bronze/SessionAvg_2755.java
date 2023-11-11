package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SessionAvg_2755 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int gradesTotal = 0;
		double gradAndRecord = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String subject = st.nextToken();
			int grades = Integer.parseInt(st.nextToken());
			double record = recordCal(st.nextToken());
			gradesTotal += grades;
			gradAndRecord += grades * record;
		}
		
		System.out.printf("%.2f", gradAndRecord / gradesTotal);
	}
	
	public static double recordCal(String re) {
		switch (re) {
			case "A+": return 4.3;
			case "A0": return 4.0;
			case "A-": return 3.7;
			case "B+": return 3.3;
			case "B0": return 3.0;
			case "B-": return 2.7;
			case "C+": return 2.3;
			case "C0": return 2.0;
			case "C-": return 1.7;
			case "D+": return 1.3;
			case "D0": return 1.0;
			case "D-": return 0.7;
			case "F": return 0.0;
			default:
				return 0.0;
		}
	}
}

package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SumDivisor {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numList = new ArrayList<>();
		List<Integer> divisorList = new ArrayList<>();
		
		int num = 0;
		while (true) {
			num = Integer.parseInt(bf.readLine());
			if(num != -1) {
				numList.add(num);				
			}else {
				break;
			}
		}
		for (int i = 0; i < numList.size(); i++) {
			int sumDivisor = 0;
			StringBuffer sb = new StringBuffer();
			for (int j = 1; j <= numList.get(i); j++) {
				if (numList.get(i) % j == 0) {
					divisorList.add(j);
				}
			}
			
			for (int j = 0; j < divisorList.size()-1; j++) {
				sumDivisor += divisorList.get(j);
			}
			if (numList.get(i) == sumDivisor) {
				sb.append(numList.get(i)).append(" = ");
				for (int j = 0; j < divisorList.size()-1; j++) {
					if (j < divisorList.size()-2) {
						sb.append(divisorList.get(j)).append(" + ");						
					}else {
						sb.append(divisorList.get(j));						
					}
				}
			}else {
				sb.append(numList.get(i)).append(" is NOT perfect.");
			}
			System.out.println(sb);
			divisorList.clear();
		}
		
	}
}

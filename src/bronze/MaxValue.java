package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] numList = new int [9];
		
		for (int i = 0; i < 9; i++) {
			numList[i] = Integer.parseInt(br.readLine());
		}
		
		int maxVal = 0;
		int maxValIndex = 0;
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] > maxVal) {
				maxVal = numList[i];
				maxValIndex = i+1;
			}
		}
		
		System.out.println(maxVal);
		System.out.println(maxValIndex);
	}
}

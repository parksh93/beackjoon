package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mario_2851 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] mer = new int [10];
		for (int i = 0; i < 10; i++) {
			mer[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		int maxNum = 0;
		for (int i = 0; i < mer.length; i++) {
			sum += mer[i];
			
			int mi = Math.abs(sum - 100);
			int maxNumMi = Math.abs(maxNum -100);
			if (maxNumMi == mi) {
				maxNum = Math.max(maxNum, sum);
			}else if(maxNumMi > mi) {
				maxNum = sum;
			}
		}
		System.out.println(maxNum);
	}
}

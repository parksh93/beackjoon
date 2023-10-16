package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sort_2750 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numCnt = Integer.parseInt(br.readLine());
		
		int [] nums = new int [numCnt];
		
		for (int i = 0; i < numCnt; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}

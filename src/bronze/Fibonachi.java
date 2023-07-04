package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//동적 프로그래밍
public class Fibonachi {
	//Memoization 기법
	static int[] dp = new int[1000];
	
	static int fibonacci(int n){
    	if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        dp[n] = fibonacci(n - 2) + fibonacci(n - 1);
        return dp[n];
    }
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		//반복문 사용
		int [] ar = new int [n+1];
		ar[1] = 1;
		for (int i = 2; i <= n; i++) {
			ar[i] = ar[i-1] + ar[i-2];
		}
		
		bw.write("반복문 사용 :" + String.valueOf(ar[n]));
		bw.newLine();
		bw.write("Memoization 사용 :" +String.valueOf(fibonacci(n)));
		
		bw.flush();
		bw.close();
	}
}

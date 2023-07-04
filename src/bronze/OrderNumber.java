package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OrderNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int ar[] = new int [t];
		int result[] = new int [t];
		
		//10000보다 같거나 작은 수를 대입 받을때 (0~10000까지 이기 때문에 배열의 크기를 10001로 한다)
		int[] counting = new int [10001];
		
		//입력 받은 값을 ar배열에 저장
		for (int i = 0; i < t; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}

		//ar[i]의 값을 인덱스로 하여 해당 인덱스에 1씩 추가
		for (int i = 0; i < ar.length; i++) {
			counting[ar[i]]++; 
		}
		
		//뒤에 인덱스 값에 앞 인덱스의 값을 더해준다.
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1];
		}
		
		//ar의 마지막 인덱스부터 시작
		//counting배열에 ar 마지막 값을 인덱스로 하여 해당 인덱스의 값을 가져옴
		//가져온 값에 1을 빼준다
		//가져온 값을 result배열의 인덱스로 대입해 해당 인덱스에 ar의 값 대입
		for (int i = ar.length-1; i >=0 ; i--) {
			counting[ar[i]]--;
			result[counting[ar[i]]] = ar[i];
		}
		
		for (int i = 0; i < ar.length; i++) {
			bw.write(Integer.toString(result[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
